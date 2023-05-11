package sptech.scholl.cafeteriaatv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sptech.scholl.cafeteriaatv2.entidades.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
