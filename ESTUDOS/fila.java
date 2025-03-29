import java.util.ArrayList;

public class fila {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();

        //fila: first in, first out (FIFO)

        alunos.add("Brayan");
        alunos.add("Saulo");
        alunos.add("Murilo");
        System.out.println(alunos);

        if(alunos.contains("Brayan")){
            System.out.println("Aluno presente!");
        }else{
            System.out.println("Aluno não presente!");
        }

        System.out.println(alunos);
    }
    
    
}
