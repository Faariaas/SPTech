public class Engenheiro extends Funcionario{

    //ATRIBUTO
    private Double salario;

    //coNSTRUTOR


    public Engenheiro(String cpf, String nome, Double salario) {
        super(cpf, nome);
        this.salario = salario;
    }

    //METODOS

    //IMPLEMENTAÇÃO DO METODO ABSTRATO CALCSALARIO

    @Override
    public Double calcSalario() {
        return salario;
    }

    //TOSTRING

    @Override
    public String toString() {
        return "Engenheiro{" +
                "salario=" + salario +
                "} " + super.toString();
    }
}
