package school.sptech.Projeto03;

public class Jogo {
    private String nome;
    private int anoLancamento;

    private String descricao;

    public Jogo(String nome, int anoLancamento, String descricao) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
