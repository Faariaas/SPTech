package sptech.school.projetocinema.dto;

public class FilmeResumoDto {

    private String nomeDiretor;
    private String nomeFilme;

    public FilmeResumoDto(String nomeDiretor, String nomeFilme) {
        this.nomeDiretor = nomeDiretor;
        this.nomeFilme = nomeFilme;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }
}
