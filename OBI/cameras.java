package OBI;

import java.util.Scanner;

public class cameras {
    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int colunas = LER.nextInt();
        int linhas = LER.nextInt();
        int[][] mat = new int[linhas][colunas];
        int cameras = LER.nextInt();
        boolean chegou = false;
        for (int i = 0; i < cameras; i++) {
            colunas = LER.nextInt() - 1;
            linhas = LER.nextInt() - 1;
            char direcao = LER.next().charAt(0);
            if (direcao == 'S') {
                for (int j = linhas; j < mat.length; j++) {
                    mat[j][colunas] = 1;
                }
            } else if (direcao == 'N') {
                for (int j = linhas; j > -1; j--) {
                    mat[j][colunas] = 1;
                }
            } else if (direcao == 'L') {
                for (int j = colunas; j < mat[0].length; j++) {
                    mat[linhas][j] = 1;
                }
            } else {
                for (int j = colunas; j > -1; j--) {
                    mat[linhas][j] = 1;
                }
            }
        }

        mat[0][0] = 3;
        while (true) {
            chegou = false;
            int[] index = provurar3(mat);
            int cont = 0;

            if (index[1] < mat[0].length - 1) { // direit
                if (mat[index[0]][index[1] + 1] != 1) {
                    mat[index[0]][index[1]] = 1;
                    mat[index[0]][index[1] + 1] = 3;
                    
                }else{
                    cont++;
                }
            }else{
                cont++;
            }
            if (index[0] < mat.length - 1) { // baixo
                if (mat[index[0] + 1][index[1]] != 1) {
                    mat[index[0]][index[1]] = 1;
                    mat[index[0] + 1][index[1]] = 3;
                    
                }else{
                    cont++;
                }
            }else{
                cont++;
            }
            if (index[1] > 0) {
                if (mat[index[0]][index[1] - 1] != 1) { // esquerda
                    mat[index[0]][index[1]] = 1;
                    mat[index[0]][index[1] - 1] = 3;
                    
                }else{
                    cont++;
                }
            }else{
                cont++;
            }
            if (index[0] > 0) { // cima
                if (mat[index[0] - 1][index[1]] != 1) {
                    mat[index[0]][index[1]] = 1;
                    mat[index[0] - 1][index[1]] = 3;
                }else{
                    cont++;
                }
            }else{
                cont++;
            }
            if (mat[mat.length - 1][mat[0].length - 1] == 3) {
                chegou = true;
                break;
            }else if(cont == 4){
                chegou = false;
                break;
            }

        }

        if (chegou) {
            System.out.println("S");
        }else{
            System.out.println("N");
        }

    }

    public static int[] provurar3(int[][] mat) {
        int[] indice3 = new int[2];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 3) {
                    indice3[0] = i;
                    indice3[1] = j;
                }

            }
        }
        return indice3;
    }

    public static void imprimir(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
