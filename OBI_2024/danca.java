package OBI_2024;

import java.util.Scanner;

public class danca {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int[][] mat = new int[LER.nextInt()][LER.nextInt()];
        int passos = LER.nextInt();
        int cont = 1;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = cont;
                cont++;
            }
        }
        for (int i = 0; i < passos; i++) {
            char passo = LER.next().charAt(0);
            int alunosA = LER.nextInt();
            int alunosB = LER.nextInt();
            if(passo == 'L'){
                int[] linhaTemp = mat[alunosA-1];
                mat[alunosA-1] = mat[alunosB-1];
                mat[alunosB-1] = linhaTemp;
            }else{
                int[] colunaTemp = new int[mat.length];
                for (int j = 0; j < mat.length; j++) {
                    colunaTemp[j] = mat[j][alunosA-1];
                }
                for (int j = 0; j < colunaTemp.length; j++) {
                    mat[j][alunosA-1] = mat[j][alunosB-1];
                }
                for (int j = 0; j < colunaTemp.length; j++) {
                    mat[j][alunosB-1] = colunaTemp[j];
                }
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
