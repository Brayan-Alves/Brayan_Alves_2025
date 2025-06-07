package OBI;

import java.util.Arrays;
import java.util.Scanner;

public class contas {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int x = LER.nextInt();
        int contas = 0;
        int[] vet = new int[3];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = LER.nextInt();
        }
        Arrays.sort(vet);
        for (int i = 0; i < vet.length; i++) {
            if(x - vet[i] >= 0){
                contas++;
                x -= vet[i];
            }else{
                break;
            }
        }
        System.out.println(contas);
    }
}
