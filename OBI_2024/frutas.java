package OBI_2024;

import java.util.Scanner;

public class frutas {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int dinheiro = LER.nextInt();
        int frutas = LER.nextInt();
        int[][] tabela = new int[frutas][2];
        for (int i = 0; i < frutas; i++) {
            tabela[i][0] = LER.nextInt();
            tabela[i][1] = LER.nextInt();
        }
        for (int i = 0; i < tabela.length; i++) {
            for (int j = 0; j < tabela.length; j++) {
                
            }
        }
    }
}
