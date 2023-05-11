package sptech.school.projetocinema.dto;

public class FilmeResumoDto {

    private String nomeFilme;
    private String nomeDiretor;

    public FilmeResumoDto(String nomeFilme, String nomeDiretor) {
        this.nomeFilme = nomeFilme;
        this.nomeDiretor = nomeDiretor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }
}
