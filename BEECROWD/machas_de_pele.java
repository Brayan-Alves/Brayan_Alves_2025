// quando a matriz eh muito grande a pilha de recursividade fica muitoi grande e da erro

package BEECROWD;

import java.util.*;

public class machas_de_pele {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int[][] mat = new int[LER.nextInt()+2][LER.nextInt()+2];
        int resp = 0;
        for (int i = 1; i < mat.length-1; i++) {
            for (int j = 1; j < mat[0].length-1; j++) {
                mat[i][j] = LER.nextInt();
            }
        }

        for (int i = 1; i < mat.length-1; i++) {
            for (int j = 1; j < mat[0].length-1; j++) {
                if(mat[i][j] == 1){
                    resp++;
                    procurarMachasRec(mat, j, i);
                }
            }
        }
        System.out.println(resp);


    }

    public static void procurarMachasRec(int[][] mat, int j, int i){
        if(mat[i+1][j] == 1){
            mat[i+1][j] = 0;
            procurarMachasRec(mat, j, i+1);
        }
        if(mat[i-1][j] == 1){
            mat[i-1][j] = 0;
            procurarMachasRec(mat, j, i-1);
        }
        if(mat[i][j+1] == 1){
            mat[i][j+1] = 0;
            procurarMachasRec(mat, j+1, i);
        }
        if(mat[i][j-1] == 1){
            mat[i][j-1] = 0;
            procurarMachasRec(mat, j-1, i);
        }
    }
}
