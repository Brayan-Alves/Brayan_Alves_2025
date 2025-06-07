package OBI;

import java.util.Arrays;
import java.util.Scanner;

public class concurso {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int n = LER.nextInt();
        int k = LER.nextInt();
        int[] notas = new int[n];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = LER.nextInt();
        }
        Arrays.sort(notas);
        System.out.println(notas[notas.length-k]);

    }
}
