package OBI_2023;

import java.util.Scanner;

public class barcos {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int m = LER.nextInt();
        int n = LER.nextInt();
        int[][] mat = new int[m][m];
        int[] jaVisitadas = new int[m];
        for (int i = 0; i < jaVisitadas.length; i++) {
            jaVisitadas[i] =  10;
        }
        for (int i = 0; i < n; i++) {
            int x = LER.nextInt()-1;
            int y = LER.nextInt()-1;
            mat[x][y] = LER.nextInt();
            mat[y][x] = mat[x][y];
        }
        n = LER.nextInt();
        for (int i = 0; i < n; i++) {
            
            int maiorPopu = 0;
            int melhorRota = 0;
            int x = LER.nextInt()-1;
            int y = LER.nextInt()-1;
            boolean sePrimeira = true;
            int index = 0;
            int cont = 0;
            while (true) {
                maiorPopu = 0;
                for (int j = 0; j < mat[0].length; j++) {
                    if(mat[x][j] > maiorPopu){
                        for (int k = 0; k < index+1; k++) {
                            if(j != jaVisitadas[index]){
                                cont++;
                            }
                            if(cont == index+1){
                                maiorPopu = mat[x][j];
                                melhorRota = j;
                            }
                        }
                    }
                }
                if(melhorRota == y){
                    System.out.println(maiorPopu);
                    break;
                }
                if(!sePrimeira){
                    x = melhorRota;
                    jaVisitadas[index] = melhorRota;
                    index++;
                }else{
                    x = melhorRota;
                    jaVisitadas[index] = melhorRota;
                    index++;
                    sePrimeira = false;
                }
            }
        }
    }
}
