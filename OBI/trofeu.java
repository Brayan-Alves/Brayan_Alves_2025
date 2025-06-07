package OBI;

import java.util.Arrays;
import java.util.Scanner;

public class trofeu {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int[] vet = new int[5];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = LER.nextInt();
        }
        Arrays.sort(vet);
        int trofeu = 1;
        int localPlaca = 0;
        int placasComemorativas = 0;
        for (int i = vet.length-1; i > 0; i--) {
            if(vet[i] == vet[i-1]){
                trofeu++;
            }else{
                localPlaca = i-1;
                placasComemorativas++;
                break;
            }
        }

        for (int i = localPlaca; i > 0; i--) {
            if(vet[i] == vet[i-1]){
                placasComemorativas++;
            }else{
                break;
            }
        }

        System.out.printf("%d %d\n", trofeu, placasComemorativas);
    }
}
