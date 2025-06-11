package OBI_2023;


import java.util.Arrays;
import java.util.Scanner;

public class subsequencia {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int[] vetA = new int[LER.nextInt()];
        int[] vetB = new int[LER.nextInt()];
        for (int i = 0; i < vetA.length; i++) {
            vetA[i] = LER.nextInt();
        }
        for (int i = 0; i < vetB.length; i++) {
            vetB[i] = LER.nextInt();
        }

        Arrays.sort(vetA);
        Arrays.sort(vetB);
        boolean resp = true;

        for (int i = 0; i < vetB.length; i++) {
            int inicio = 0;
            int fim = vetA.length-1;
            int x = vetB[i];
            boolean achou = false;

            if(!resp){
                break;
            }

            while (inicio <= fim) {
                int meio = (inicio+fim)/2;
                if(x == vetA[meio]){
                    achou = true;
                    break;
                }else if(x < vetA[meio]){
                    fim = meio-1;
                }else{
                    inicio = meio+1;
                }
            }
            if(!achou){
                resp = false;
            }
            
        }

        if(resp){
            System.out.println("S");
        }else{
            System.out.println("N");
        }
    }
}
