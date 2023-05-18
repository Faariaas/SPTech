import java.util.ArrayList;
import java.util.List;

public class Escola {

    private String nome;
    private List<Aluno> lista;

    public Escola () {
        lista = new ArrayList<Aluno>();
    }

    public void adiconaAluno(Aluno a){
        lista.add(a);
    }

    public void exibeTodos (){
        System.out.println("Lista de alunos matriculados");
        for(Aluno a : lista){
            System.out.println("Alunos: " + a);
        }

    }
    public void exibeAlunosGraduacao (){
        System.out.println("Lista de matriculados da Graduação");
            for(Aluno a : lista) {
                if(a instanceof AlunoGraduacao){
                    System.out.println(a);
                }
            }
    }
    public void ExibeAprovados (Integer ra){

        System.out.println("Alunos Aprovados");
        for (Aluno a : lista){
            if(a.calculaMedia() >= 6.0){
                System.out.println(a);
            }
        }
    }

    public void buscaAluno(Integer ra){
        for (Aluno a : lista){
            if(a.getRa().equals(ra)){
                System.out.println(a);
            }
        }
    }

}
