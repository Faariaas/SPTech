package school.sptech.primeiraapi;

public class Heroi {
    private String nome;
    private int idade;
    private String habilidade;
    private Double forca;
    private boolean vivo;

    public Heroi() {
    }

    public Heroi(String nome, int idade, String habilidade, Double forca, boolean vivo) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.forca = forca;
        this.vivo = vivo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public Double getForca() {
        return forca;
    }

    public boolean isVivo() {
        return vivo;
    }

    public String descricao(){
        if(forca > 500.0){
            return "Muito Forte";
        }
        return "Que merda ein";

        return forca > 500.0? ("Muitoforte" : "que merda");
    }
}
