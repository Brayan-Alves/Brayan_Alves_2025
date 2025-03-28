package ESTUDOS_OBI;

import java.util.ArrayList;

public class lista {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();

        //fila: first in, first out (FIFO)

        alunos.add("Brayan");
        alunos.add("Saulo");
        alunos.add("Murilo");
        System.out.println(alunos);


        alunos.pop();

        if(alunos.contains("Brayan")){
            System.out.println("Aluno presente!");
        }else{
            System.out.println("Aluno não presente!");
        }

        System.out.println(alunos);
    }
    
    
}
