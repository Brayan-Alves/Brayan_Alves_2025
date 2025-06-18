package BEECROWD;

import java.util.Scanner;

public class matriz_quadrada_I {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            int x = LER.nextInt();

            if(x == 0){
                break;
            }

            int[][] mat = new int[x][x];

            int cont = 1;
            while (cont <= (mat.length/2 +mat.length%2)) {
                for (int i = 0; i < mat.length; i++) {
                    for (int j = 0; j < mat.length; j++) {
                        if(i == cont-1 || j == cont-1 || mat.length-1-j == cont-1 || mat.length-1-i == cont-1){
                            if(mat[i][j] == 0){
                                mat[i][j] = cont;
                            }
                        }
                    }
                }
                cont++;
            }

            for (int i = 0; i < mat.length; i++) {
                System.out.print("  ");
                for (int j = 0; j < mat.length; j++) {
                    if(j != mat.length-1){
                        System.out.print(mat[i][j] + "   ");
                    }else{
                        System.out.print(mat[i][j]);
                    }
                }
                System.out.println();
            }
            System.out.println();

        }
    }
}
