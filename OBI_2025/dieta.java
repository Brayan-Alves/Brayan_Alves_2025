package OBI_2025;

import java.util.Scanner;

public class dieta {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int refeicoes = LER.nextInt();
        int limCalorias = LER.nextInt();
        int[] refeicao = new int[3];
        int caloriasComidas = 0;

        for (int i = 0; i < refeicoes; i++) {
            for (int j = 0; j < refeicao.length; j++) {
                refeicao[j] = LER.nextInt();
            }
            caloriasComidas += refeicao[0] * 4;
            caloriasComidas += refeicao[1] * 9;
            caloriasComidas += refeicao[2] * 4;
        }

        System.out.println(limCalorias - caloriasComidas);

    }
}
