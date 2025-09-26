package SIMULADO;

import java.util.Scanner;


public class linguaP {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        String frase = LER.nextLine();
        char[] vet = frase.toCharArray();
        boolean remove = true;
        for (int i = 0; i < vet.length; i++) {
            if(vet[i] != ' '){
                if(remove){
                    vet[i] = '1';
                    remove = false;
                }else{
                    remove = true;
                }
            }
        }

        for (int i = 0; i < vet.length; i++) {
            if(vet[i] != '1'){
                System.out.print(vet[i]);
            }
        }
        System.out.println();
    }
}
