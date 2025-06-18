package BEECROWD;

import java.util.Scanner;

public class area_direita {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        char operacao = LER.next().charAt(0);
        double[][] mat = new double[12][12];
        double soma = 0;
        double media = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = LER.nextDouble();
            }
        }

        if(operacao == 'S'){
            int menos = 0;
            for (int i = 7; i < mat.length; i++) {
                for (int j = 5 - menos; j < i; j++) {
                    if(j == 0){
                        soma += (float)mat[j][i];
                        break;
                    }
                    soma += (float)mat[j][i];
                }
                menos++;
            }
            System.out.printf("%.1f\n", soma);
        }else{
            int cont = 0;
            int menos = 0;
            for (int i = 7; i < mat.length; i++) {
                for (int j = 5-menos; j < i; j++) {
                    if(j == 0){
                        soma += (float)mat[j][i];
                        break;
                    }
                    soma += (float)mat[j][i];
                    cont++;
                }
                menos++;
            }
            media = soma / (float)cont;
            System.out.printf("%.1f\n", media);
        }
    }
}
