package OBI_2024;

import java.util.Scanner;

public class jogo {
    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        
        int x = LER.nextInt();
        int o = LER.nextInt();

        int[][] mat = new int[x + 2][x + 2];
        int[][] matFinal = new int[x+2][x+2];
        LER.nextLine();
        System.out.println();
        for (int i = 1; i < mat.length-1; i++) {
            String linhaMat = LER.nextLine();
            for (int j = 1; j < mat.length-1; j++) {
                mat[i][j] = Character.valueOf(linhaMat.charAt(j-1)) % 48;
            }
        }

        for (int i = 0; i < o; i++) {
            for (int j = 1; j < mat.length-1; j++) {
                for (int j2 = 1; j2 < mat[0].length-1; j2++) {
                    int cont = 0;
                    if (mat[j - 1][j2 - 1] == 1) {
                        cont++;
                    }
                    if (mat[j - 1][j2] == 1) {
                        cont++;
                    }
                    if (mat[j - 1][j2 + 1] == 1) {
                        cont++;
                    }
                    if (mat[j][j2 - 1] == 1) {
                        cont++;
                    }
                    if (mat[j][j2 + 1] == 1) {
                        cont++;
                    }
                    if (mat[j + 1][j2 - 1] == 1) {
                        cont++;
                    }
                    if (mat[j + 1][j2] == 1) {
                        cont++;
                    }
                    if (mat[j + 1][j2 + 1] == 1) {
                        cont++;
                    }

                    if(mat[j][j2] == 0){
                        if(cont == 3){
                            matFinal[j][j2] = 1;
                        }
                    }else{
                        if(cont < 2 || cont > 3){
                            matFinal[j][j2] = 0;
                        }else{
                            matFinal[j][j2] = 1;
                        }
                    }
                }
            }
            mat = matFinal.clone();
            matFinal = new int[x+2][x+2];
        }
        for (int j = 1; j < mat.length-1; j++) {
            for (int j2 = 1; j2 < mat.length-1; j2++) {
                System.out.print(mat[j][j2]);
            }
            System.out.println();
        }
    }
}