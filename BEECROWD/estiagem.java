package BEECROWD;

import java.util.*;

public class estiagem {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int cont = 0;
        while (true) {
            
            int x = LER.nextInt();

            if(x == 0){
                break;
            }
            cont++;
            
            int[][] mat = new int[x][2];
            
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    mat[i][j] = LER.nextInt();
                }
            }
            
            int[] consumo = new int[x];
            for (int i = 0; i < consumo.length; i++) {
                consumo[i] = mat[i][1] / mat[i][0];
            }
            
            System.out.printf("Cidade# %d:\n", cont);
            Arrays.sort(consumo);
            for (int i = 0; i < consumo.length; i++) {
                for (int j = 0; j < consumo.length; j++) {
                    if(consumo[i] == mat[j][1] / mat[j][0]){
                        if(j != consumo.length-1){
                            if(consumo[i+1] == mat[j][1] / mat[j][0]){
                                System.out.print(mat[j][0]+"-"+consumo[i]);
                                break;
                            }
                        }
                    }
                }
                System.out.print(" ");
            }

            float total = 0f;
            for (int i = 0; i < mat.length; i++) {
                total += mat[i][1];
            }
            float dividendo = 0f;
            for (int i = 0; i < mat.length; i++) {
                dividendo += mat[i][0];
            }
            float resp = total / dividendo;
            System.out.printf("\nConsumo medio: %.2f m3.\n", resp);
        }
    }
}
