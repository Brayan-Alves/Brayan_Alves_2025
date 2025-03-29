package BEECROWD;

import java.util.Scanner;
import java.util.Stack;

public class balanco_de_parenteses_I {
    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        while (LER.hasNext()) {
            String expressao = LER.next();
            Stack<Character> parenteses = new Stack<>();
            char[] sim = expressao.toCharArray();
            int cont = 0;

            for (int i = 0; i < sim.length; i++) {
                if (sim[i] == '(') {
                    parenteses.add('(');
                } else if(sim[i] == ')') {
                    parenteses.add(')');
                }
            }

            int tamPilha = parenteses.size();

            for (int i = 0; i < parenteses.size(); i++) {
                if(tamPilha % 2 != 0){
                    break;
                }
                if(parenteses.pop() == ')'){
                    
                }
            }

            if(tamPilha == cont){
                System.out.println("correct");
            }else{
                System.out.println("incorrect");
            }
        }

    }
}
