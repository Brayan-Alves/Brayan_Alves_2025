package BEECROWD;

import java.util.Scanner;

public class roteadores {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int num = LER.nextInt() + 1;
        LER.nextInt();
        int[][] mapa = new int[num][num];
        int soma = 0;

        //      [0]   [1]   [2]   [3]   [4]   [5]   [6]   [7]
        //  [0] !!!

        //  [1]       !!!          6     9

        //  [2]            !!!    17          32          27

        //  [3]        6     17   !!!    11    4

        //  [4]        9           11   !!!    3     19

        //  [5]              32    4      3   !!!    13    15

        //  [6]                          19    13    !!!    5

        //  [7]              27                15     5   !!!

        for (int i = 0; i < 12; i++) {
            int x = LER.nextInt() + 1;
            int y = LER.nextInt() + 1;
            mapa[x][y] = LER.nextInt();
            mapa[y][x] = mapa[x][y];
        }

        int ligamento = 1;
        boolean[] seLigado = new boolean[num];
        seLigado[0] = true;

        for (int i = ligamento; i < mapa.length - 1; i++) {
            int menorCaminho = Integer.MAX_VALUE;
            for (int j = i + 1; j < mapa.length; j++) {
                if(mapa[i][j] == 0){
                    break;
                }else{
                    if(mapa[i][j] < menorCaminho){
                        menorCaminho = mapa[i][j];
                        ligamento = j;
                    }
                }
                seLigado[j-1] = true;
                soma += menorCaminho;
            }
        }

        System.out.println(soma);


    }
}
