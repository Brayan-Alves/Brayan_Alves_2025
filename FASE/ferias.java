package FASE;

import java.util.Scanner;

public class ferias {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int atividadesTotal = 0;
        int contRev = 0;
        int contCans = 0;
        int disposicao = LER.nextInt();
        int x = LER.nextInt();
        int[] atiCansativas = new int[x];
        x = LER.nextInt();
        int[] atiRevigorantes = new int[x];

        for (int i = 0; i < atiCansativas.length; i++) {
            atiCansativas[i] = LER.nextInt();
        }

        for (int i = 0; i < atiRevigorantes.length; i++) {
            atiRevigorantes[i] = LER.nextInt();
        }

        while (true) {
            
            if((contCans == (atiCansativas.length - 1)) && (contRev == (atiRevigorantes.length - 1))){
                break;
            }

            if((disposicao >= atiCansativas[contCans]) && (contCans < atiCansativas.length)){
                disposicao -= atiCansativas[contCans];
                contCans++;
                atividadesTotal++;
            }

            if(contRev < atiRevigorantes.length){
                disposicao += atiRevigorantes[contRev];
                contRev++;
                atividadesTotal++;
            }

        }

        System.out.println(atividadesTotal);
    }
}
