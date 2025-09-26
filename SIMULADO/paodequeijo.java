package SIMULADO;

import java.util.Scanner;

public class paodequeijo {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        while (LER.hasNext()) {
            int[][] mat = new int[LER.nextInt()+2][LER.nextInt()+2];
            for (int i = 1; i < mat.length-1; i++) {
                for (int j = 1; j < mat[0].length-1; j++) {
                    mat[i][j] = LER.nextInt();
                }
            }
            int[][] matF = new int[mat.length][mat[0].length];
            for (int i = 1; i < matF.length-1; i++) {
                for (int j = 1; j < matF[0].length-1; j++) {
                    if(mat[i][j] != 1){
                        int cont = 0;
                        if(mat[i+1][j] == 1){
                            cont++;
                        }
                        if(mat[i-1][j] == 1){
                            cont++;
                        }
                        if(mat[i][j+1] == 1){
                            cont++;
                        }
                        if(mat[i][j-1] == 1){
                            cont++;
                        }
                        matF[i][j] = cont;
                    }else{
                        matF[i][j] = 9;
                    }
                }
            }
    
            for (int i = 1; i < matF.length-1; i++) {
                for (int j = 1; j < matF[0].length-1; j++) {
                    System.out.print(matF[i][j]);
                }
                System.out.println();
            }
        }
    }
}
