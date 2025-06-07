package OBI_2024;

import java.util.Scanner;

public class relogio {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        final int[] MAX_TEMP = {24, 60, 60};
        int[] tempo = new int[3];
        for (int i = 0; i < tempo.length; i++) {
            tempo[i] = LER.nextInt();
        }
        int x = LER.nextInt();
        tempo[2] += x;
        for (int i = tempo.length-1; i > 0; i--) {
            tempo[i-1] += tempo[i] / MAX_TEMP[i];
            tempo[i] %= MAX_TEMP[i];
        }
        for (int i = 0; i < tempo.length; i++) {
            System.out.println(tempo[i]);
        }
    }
}
