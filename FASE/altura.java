package FASE;

import java.util.Scanner;

public class altura{
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int cont = 0;
        int x = LER.nextInt();
        int[] vet = new int[x];
        int altura = LER.nextInt();
        for (int i = 0; i < vet.length; i++) {
            vet[i] = LER.nextInt();
        }
        for (int i = 0; i < vet.length; i++) {
            if(altura >= vet[i]){
                cont++;
            }
        }
        System.out.println(cont);

    }
}