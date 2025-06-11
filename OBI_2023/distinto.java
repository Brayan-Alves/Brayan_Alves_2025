package OBI_2023;

import java.util.Scanner;

public class distinto {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int[] vet = new int[LER.nextInt()];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = LER.nextInt();
        }

        int seqMax = 0;
        int index = 0;
        int cont = 0;
        int seqAtu = 0;
        int[] jaVistos = new int[vet.length];
        for (int p = 0; p < vet.length; p++) {
            for (int i = 0; i < vet.length; i++) {
                cont = 0;
                for (int j = 0; j < index+1; j++) {
                    if(vet[i] != jaVistos[j]){
                        cont++;
                    }
                }
                if(cont == index+1){
                    jaVistos[index] = vet[i];
                    index++;
                    seqAtu++;
                }else{
                    if(seqAtu > seqMax){
                        seqMax = seqAtu;
                        seqAtu = 0;
                        jaVistos = new int[vet.length];
                        index = 0;
                        break;
                    }
                }
            }
        }
        System.out.println(seqMax);
    }
}
