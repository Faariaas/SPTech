package sptech.scholl.cafeteriaatv2.dto;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sptech.scholl.cafeteriaatv2.entidades.Cliente;

import java.util.List;
import java.util.Optional;

public class PedidoDTO {
    private Long id;

    @NotNull
    private Long idCliente;

    private List<ProdutoDTO> itens;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public List<ProdutoDTO> getItens() {
        return itens;
    }

    public void setItens(List<ProdutoDTO> itens) {
        this.itens = itens;
    }
// getters e setters

    @Repository
    public static interface ClienteRepository extends JpaRepository<Cliente, Long> {
        boolean existsByEmail(String email);
        Optional<Cliente> findByEmail(String email);
    }
}
