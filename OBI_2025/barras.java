package OBI_2025;

import java.util.Scanner;

public class barras {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int[] num = new int[LER.nextInt()];
        int maiorNum = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = LER.nextInt();
            maiorNum = Math.max(maiorNum, num[i]);
        }

        int[][] grafico = new int[maiorNum][num.length];
        for (int i = 0; i < grafico[0].length; i++) {
            for (int j = grafico.length-1; j > -1; j--) {
                if(num[i] != 0){
                    grafico[j][i] = 1;
                    num[i]--;
                }else{
                    break;
                }
            }
        }

        for (int i = 0; i < grafico.length; i++) {
            for (int j = 0; j < grafico[0].length; j++) {
                if(j != grafico[0].length-1){
                    System.out.print(grafico[i][j] + " ");
                }else{
                    System.out.print(grafico[i][j]);
                }
            }
            System.out.println();
        }
    }
}
