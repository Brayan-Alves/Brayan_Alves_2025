package IFPR;

import java.util.Scanner;

public class matriz{
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int[][] matA = {{1, 2, 3},
                        {0, 1, 4},
                        {0, 0, 1}};
        int[][] matB = {{1, -2, 5},
                        {0, 1, -4},
                        {0, 0, 1}};

        if(verificarSeInversa(matA, matB)){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }
        
    }

    public static boolean verficarSeTriangular(int[][] mat){
        if(mat.length != mat[0].length){
            return false;
        }

        boolean seTriangular = true;
        if(mat[0][1] == 0){
            for (int i = 0; i < mat.length - 1; i++) {
                for (int j = i + 1; j < mat[0].length; j ++) {
                    if(mat[i][j] != 0){
                        seTriangular = false;
                        return seTriangular;
                    }
                }
            }
            System.out.println("É uma matriz triangular inferior!");
        }else{
            for (int i = 1; i < mat.length; i++) {
                for (int j = 0; j < i; j++) {
                    if(mat[i][j] != 0){
                        seTriangular = false;
                        return seTriangular;
                    }
                }
            }
            System.out.println("É uma matriz triangular superior!");
        }
        return seTriangular;
    }

    public static boolean verificarSeQuadrada(int[][] mat){
        boolean seQuadrada = false;
        if(mat[0].length == mat.length){
            seQuadrada = true;
        }
        return seQuadrada;
    }

    public static boolean verificarSeNula(int[][] mat){
        boolean seNula = false;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] != 0){
                    seNula = true;
                }
            }
        }
        return seNula;
    }

    public static boolean verificarSeDiagonal(int[][] mat){
        if(mat.length != mat[0].length){
            return false;
        }

        boolean seDiagonal = true;
        for (int i = 0; i < mat.length - 1; i++) {
            for (int j = i + 1; j < mat[0].length; j ++) {
                if(mat[i][j] != 0){
                    seDiagonal = false;
                    return seDiagonal;
                }
            }
        }
        for (int i = 1; i < mat.length; i++) {
            for (int j = 0; j < i; j++) {
                if(mat[i][j] != 0){
                    seDiagonal = false;
                    return seDiagonal;
                }
            }
        }
        return seDiagonal;
    }

    public static boolean verificarSeIdentidade(int[][] mat){
        if(mat.length != mat[0].length){
            return false;
        }

        boolean seIdentidade = true;
        for (int i = 0; i < mat.length - 1; i++) {
            for (int j = i + 1; j < mat[0].length; j ++) {
                if(mat[i][j] != 0){
                    seIdentidade = false;
                    return seIdentidade;
                }
            }
        }
        for (int i = 1; i < mat.length; i++) {
            for (int j = 0; j < i; j++) {
                if(mat[i][j] != 0){
                    seIdentidade = false;
                    return seIdentidade;
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            if(mat[i][i] != 1){
                seIdentidade = false;
                return seIdentidade;
            }
        }
        return seIdentidade;
    }

    public static boolean verificarSeLinha(int[][] mat){
        boolean seLinha = true;
        if(mat.length != 1){
            seLinha = false;
        }
        return seLinha;
    }

    public static boolean verificarSeColuna(int[][] mat){
        boolean seColuna = true;
        if(mat[0].length != 1){
            seColuna = false;
        }
        return seColuna;
    }

    public static boolean verificarSeSimetrica(int[][] mat){
        boolean seSimetrica = true;
        for (int i = 0; i < mat.length; i++) {
            for (int j = i; j < mat[0].length; j++) {
                if(mat[i][j] != mat [j][i]){
                    seSimetrica = false;
                    break;
                }
            }
        }
        return seSimetrica;
    }

    public static boolean verificarSeIgual(int[][] matA, int[][] matB){
        if(matA.length != matB.length || matA[0].length != matB[0].length){
            return false;
        }

        boolean seIgual = true;
        for (int i = 0; i < matA.length; i++) {
            for (int j = i; j < matA[0].length; j++) {
                if(matA[i][j] != matB[i][j]){
                    seIgual = false;
                    break;
                }
            }
        }
        return seIgual;
    }

    public static int[][] somar(int[][] matA, int[][] matB){
        int[][] matC = new int[matA.length][matA[0].length];

        for (int i = 0; i < matC.length; i++) {
            for (int j = 0; j < matC.length; j++) {
                matC[i][j] = matA[i][j] + matB[i][j];
            }
        }

        return matC;
    }

    public static int[][] subtrair(int[][] matA, int[][] matB){
        int[][] matC = new int[matA.length][matA[0].length];

        for (int i = 0; i < matC.length; i++) {
            for (int j = 0; j < matC.length; j++) {
                matC[i][j] = matA[i][j] - matB[i][j];
            }
        }

        return matC;
    }

    public static float[][] multiplicarPorNumeroReal(int[][] matA, float k){
        float[][] matB = new float[matA.length][matA[0].length];

        for (int i = 0; i < matB.length; i++) {
            for (int j = 0; j < matB.length; j++) {
                matB[i][j] = matA[i][j] * k;
            }
        }

        return matB;
    }

    public static int[][] fazerOposicao(int[][] matA){
        int[][] matB = new int[matA.length][matA[0].length];

        for (int i = 0; i < matB.length; i++) {
            for (int j = 0; j < matB[0].length; j++) {
                matB[i][j] = matA[i][j] * -1;
            }
        }

        return matB;
    }

    public static int[][] fazerTransposicao(int[][] matA){
        int[][] matB = new int[matA[0].length][matA.length];

        for (int i = 0; i < matB.length; i++) {
            for (int j = 0; j < matB[0].length; j++) {
                matB[i][j] = matA[j][i];
            }
        }

        return matB;
    }

    public static int[][] multiplicarMatrizes(int[][] matA, int[][] matB) {
        int[][] matC = new int[matA.length][matB[0].length];
        
        for (int i = 0; i < matC.length; i++) {
            for (int j = 0; j < matC[0].length; j++) {
                for (int k = 0; k < matA[0].length; k++) {
                    matC[i][j] += matA[i][k] * matB[k][j];
                }
            }
        }
        
        return matC;
    }

    public static boolean verificarSeInversa(int[][] matA, int[][] matB) {
        boolean seInversa = false;
        int[][] matC = multiplicarMatrizes(matA, matB);
        
        if(verificarSeIdentidade(matC)){
            seInversa = true;
        }
        
        return seInversa;
    }


}