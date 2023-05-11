package school.sptech.videojogosatividade.entidades;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Schema(name = "nome", description = "Nome da empresa", example = "WildCard")
    private String nome;
    @Schema(name = "Apelido", description = "Comumente chamada", example = "A que fez o ark")
    private String apelido;
    @OneToMany(mappedBy = "empresa")
    private List<Jogo> jogo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
}
