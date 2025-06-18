package BEECROWD;
import java.util.Scanner;

public class area_inferior {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        char operacao = LER.next().charAt(0);
        float[][] mat = new float[12][12];
        float soma = 0f;
        float media = 0f;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = LER.nextFloat();
            }
        }
        if(operacao == 'S'){
            int menos = 0;
            for (int i = 7; i < mat.length; i++) {
                for (int j = 5 - menos; j < i; j++) {
                    if(j == 0){
                        soma += (float)mat[i][j];
                        break;
                    }
                    soma += (float)mat[i][j];
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
                        soma += (float)mat[i][j];
                        break;
                    }
                    soma += (float)mat[i][j];
                    cont++;
                }
                menos++;
            }
            media = soma / (float)cont;
            System.out.printf("%.1f\n", media);
        }
    }
}
