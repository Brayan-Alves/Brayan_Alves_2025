

import java.util.Arrays;
import java.util.Scanner;

public class idade {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int[] vet = new int[3];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = LER.nextInt();
        }
        Arrays.sort(vet);
        System.out.println(vet[1]);
    }
}
