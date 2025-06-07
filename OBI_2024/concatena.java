package OBI_2024;

import java.util.Scanner;

public class concatena {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int[] lista = new int[LER.nextInt()];
        int verificacao = LER.nextInt();
        for (int i = 0; i < lista.length; i++) {
            lista[i] = LER.nextInt();
        }
        int soma = 0;
        for (int i = 0; i < verificacao; i++) {
            int inicio = LER.nextInt()-1;
            int fim = LER.nextInt();
            soma = 0;
            for (int j = inicio; j < fim; j++) {
                for (int j2 = inicio; j2 < fim; j2++) {
                    if(j2 != j){
                        soma += Integer.parseInt(""+lista[j]+""+lista[j2]);
                    }
                }
            }
            System.out.println(soma);
        }
    }
}
