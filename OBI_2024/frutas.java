package OBI_2024;

import java.util.Scanner;

public class frutas {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int dinheiro = LER.nextInt();
        int frutas = LER.nextInt();
        int resp = 0;
        int[][] tabela = new int[frutas][2];
        int[] jaCompradas = new int[frutas];
        for (int i = 0; i < frutas; i++) {
            tabela[i][0] = LER.nextInt();
            tabela[i][1] = LER.nextInt();
        }
        for (int i = 0; i < tabela.length; i++) {
            for (int j = tabela.length-1; j > 0; j--) {
                if(tabela[j][1] < tabela[j-1][1]){
                    int[] temp = tabela[j];
                    tabela[j] = tabela[j-1];
                    tabela[j-1] = temp;
                }
            }
        }
        int cont = 0;
        for (int i = 0; i < frutas; i++) {
            if(tabela[i][1] <= dinheiro){
                for (int j = 0; j < cont+1; j++) {
                    if(tabela[i][0] != jaCompradas[j]){
                        dinheiro -= tabela[i][1];
                        jaCompradas[cont] = tabela[i][0];
                        cont++;
                        resp++;
                        break;
                    }
                }
            }
        }
        System.out.println(resp);

    }
}
