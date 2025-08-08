import java.util.Stack;
import java.util.Scanner;
import java.util.ArrayList;

public class bee_1110{
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Stack<Integer> pilha = new Stack<>();
        while (true) {
            
            int x = LER.nextInt();
            
            if(x == 0){
                break;
            }      
            
            
            for (int i = 1; i <= x; i++) {
                pilha.add(i);
            }
            
            while (true) {
                
                if(pilha.size() >= 2){
                    lista.add(pilha.peek());
                    pilha.pop();
                    if(pilha.size() == 2){
                        pilha.push(pilha.pop());
                    }else{
                        pilha.add(pilha.pop());    
                    }
                }else{
                    break;
                }
            }

            System.out.print("Discarded cards: ");
            while (true) {
                if(lista.size() != 1){
                    System.out.print(lista.get(0)+", ");
                    lista.remove(0);
                }else{
                    System.out.println(pilha.pop());
                    System.out.println();
                    break;
                }
                
            }

            System.out.println("Remaining cards: " + lista.get(0));
            lista.clear();
            pilha.clear();
        }
    }
}