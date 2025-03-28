package BEECROWD;

import java.util.Scanner;

public class macaco_prego {
    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        int[] x = new int[4];
        int[] y = new int[4];
        int testes = 1;

        while (true) {

            x[5] = Integer.MIN_VALUE;
            x[6] = Integer.MAX_VALUE;
            yAFinal = Integer.MAX_VALUE;
            yBFinal = Integer.MIN_VALUE;

            int num = lerInt();

            if (num == 0) {
                break;
            }

            for (int i = 0; i < num; i++) {
                int xA = lerInt();
                int yA = lerInt();
                int xB = lerInt();
                int yB = lerInt();

                if (xA > xAFinal) {
                    xAFinal = xA;
                }
                if (yA < yAFinal) {
                    yAFinal = yA;
                }
                if (xB < xBFinal) {
                    xBFinal = xB;
                }
                if (yB > yBFinal) {
                    yBFinal = yB;
                }
            }

            System.out.println("Teste: " + testes);
            
            if (yAFinal > yBFinal && xAFinal < xBFinal) {
                System.out.println(xAFinal + " " + yAFinal + " " + xBFinal + " " + yBFinal);
            } else {
                System.out.println("nenhum");
            }
            testes++;

        }

        
    }

    public static int lerInt() {
        return LER.nextInt();
    }
}
