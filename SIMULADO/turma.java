package SIMULADO;

import java.util.Scanner;

public class turma {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int x = LER.nextInt();
        int[] vet = new int[x];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = LER.nextInt();
        }
    }
}
