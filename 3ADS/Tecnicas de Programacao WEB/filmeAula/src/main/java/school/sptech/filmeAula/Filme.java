package school.sptech.filmeAula;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

@Entity
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFilme;
    @NotBlank
    private String nome;
    @NotBlank
    private String diretor;
    @PastOrPresent
    private LocalDate dataLancamento;
    private Double custoProducao;
    private Boolean indicacaoOscar;

    public long getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(long idFilme) {
        this.idFilme = idFilme;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Double getCustoProducao() {
        return custoProducao;
    }

    public void setCustoProducao(Double custoProducao) {
        this.custoProducao = custoProducao;
    }

    public Boolean getIndicacaoOscar() {
        return indicacaoOscar;
    }

    public void setIndicacaoOscar(Boolean indicacaoOscar) {
        this.indicacaoOscar = indicacaoOscar;
    }
}
