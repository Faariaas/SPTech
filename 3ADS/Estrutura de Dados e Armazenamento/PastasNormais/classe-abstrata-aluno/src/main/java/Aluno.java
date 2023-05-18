public abstract class Aluno {

    private String nome;
    private Integer ra;

    public Aluno(String nome, Integer ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public abstract Double calculaMedia();

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", ra=" + ra +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }
}
//'\'' +
//                ", Media do aluno:" + calculaMedi() +
