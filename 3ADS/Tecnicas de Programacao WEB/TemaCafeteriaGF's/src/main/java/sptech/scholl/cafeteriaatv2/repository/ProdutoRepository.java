package sptech.scholl.cafeteriaatv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sptech.scholl.cafeteriaatv2.entidades.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    @Query("SELECT COUNT(i) FROM ItemPedido i WHERE i.pedido.id = :idPedido")
    int countByPedidoId(@Param("idPedido") Long idPedido);
}
