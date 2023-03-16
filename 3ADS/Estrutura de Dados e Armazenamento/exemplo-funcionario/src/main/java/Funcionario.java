public abstract class Funcionario {

    //ATRIBUTOS
    private String cpf;
    private String nome;

    //CONSTRUTOR
    public Funcionario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    //METODOS

    //Metodo abstrato calcSalario
    public abstract Double calcSalario();

    //TOSTRING
    @Override
    public String toString() {
        return "Funcionario{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", salario=" + calcSalario() +
                '}';
    }
}
