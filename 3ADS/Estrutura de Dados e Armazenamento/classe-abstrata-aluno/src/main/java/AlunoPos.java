public abstract class AlunoPos extends Aluno{
    private Double nota1;
    private Double nota2;
    private Double notaMonografia;

    public AlunoPos(String nome, Integer ra, Double nota1, Double nota2, Double notaMonografia) {
        super(nome, ra);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaMonografia = notaMonografia;
    }

    public Double calculaMedia(){
        return (nota1+ nota2 + notaMonografia)/3;
    }
}
