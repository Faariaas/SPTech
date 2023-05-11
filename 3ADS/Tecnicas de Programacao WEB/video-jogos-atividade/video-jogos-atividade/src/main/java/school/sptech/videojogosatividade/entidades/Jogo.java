package school.sptech.videojogosatividade.entidades;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Jogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Schema(name = "nome", description = "Titulo da fraquia", example = "Ark: Survivavel")
    private String nome;
    @ManyToOne
    private Empresa empresa;
    @Schema(name = "Ano de Lançamento", description = "Data que saiu o jogo", example = "2015-06-02")
    private LocalDate dataLancamento;
    @Schema(name = "gameOfTheYear", description = "Sera que tem??", example = "True or False")
    private boolean gameOfTheYear;

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

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public boolean isGameOfTheYear() {
        return gameOfTheYear;
    }

    public void setGameOfTheYear(boolean gameOfTheYear) {
        this.gameOfTheYear = gameOfTheYear;
    }
}
