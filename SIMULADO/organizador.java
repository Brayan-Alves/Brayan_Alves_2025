package SIMULADO;

import java.util.Scanner;

public class organizador {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int x = LER.nextInt();
        
        for (int i = 0; i < x; i++) {
            int resp = 0;
            int p = LER.nextInt();
            int[] vet = new int[p];
            for (int k = 0; k < p; k++) {
                vet[k] = LER.nextInt();
            }
    
            for (int j = 0; j < vet.length; j++) {
                for (int j2 = j+1; j2 < vet.length; j2++) {
                    if(vet[j] > vet[j2]){
                        int temp = vet[j];
                        vet[j] = vet[j2];
                        vet[j2] = temp;
                        resp++;
                    }
                }
            }
    
            System.out.println("Optimal train swapping takes "+ resp+ " swaps.");
        }
    }
}
