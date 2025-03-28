package ESTUDOS_OBI;

import java.util.Stack;

public class pilha {

    public static void main(String[] args) {

        // pilha: last in, first out (LIFO)

        Stack<String> frutas = new Stack<>();

        frutas.add("Banana");
        frutas.add("Maça");
        frutas.add("Pera");
        System.out.println(frutas);

        System.out.println(frutas.pop());
        //.pop() remove o ultimo elemento colocado na pilha
    }
    
}
