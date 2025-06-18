package BEECROWD;

import java.util.Scanner;

public class area_esquerda {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        char operacao = LER.next().charAt(0);
        double[][] mat = new double[12][12];
        double soma = 0;
        double media = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = LER.nextDouble();
            }
        }

        if(operacao == 'S'){
            int menos = 0;
            int limite = 3;
            for (int i = 4; i >= 0; i--) {
                for (int j = 5 - menos; j < i + limite; j++) {
                    if(j == 0){
                        soma += (float)mat[j][i];
                        break;
                    }
                    soma += (float)mat[j][i];
                }
                menos++;
                limite+=2;
            }
            System.out.printf("%.1f\n", soma);
        }else{
            int cont = 0;
            int menos = 0;
            int limite = 3;
            for (int i = 4; i >= 0; i--) {
                for (int j = 5 - menos; j < i + limite; j++) {
                    if(j == 0){
                        soma += (float)mat[j][i];
                        cont++;
                        break;
                    }
                    soma += (float)mat[j][i];
                    cont++;
                }
                menos++;
                limite+=2;
            }
            media = soma / (float)cont;
            System.out.printf("%.1f\n", media);
        }
    

       
    }
}
