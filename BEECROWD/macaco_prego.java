package BEECROWD;

import java.util.Scanner;

public class macaco_prego {
    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        int[] x = new int[4];   //xA  xB  xAFinal xBFinal
        int[] y = new int[4];   //yA  yB  yAFinal yBFinal
        int testes = 1;

        while (true) {

            x[2] = Integer.MIN_VALUE;
            x[3] = Integer.MAX_VALUE;
            y[2] = Integer.MAX_VALUE;
            y[3] = Integer.MIN_VALUE;

            int num = lerInt();

            if (num == 0) {
                break;
            }

            for (int i = 0; i < num; i++) {
                x[0] = lerInt();
                y[0] = lerInt();
                x[1] = lerInt();
                y[1] = lerInt();

                if (x[0] > x[2]) {
                    x[2] = x[0];
                }
                if (y[0] < y[2]) {
                    y[2] = y[0];
                }
                if (x[1] < x[3]) {
                    x[3] = x[1];
                }
                if (y[1] > y[3]) {
                    y[3] = y[1];
                }
            }

            System.out.println("Teste " + testes);
            
            if (y[2] > y[3] && x[2] < x[3]) {
                System.out.println(x[2] + " " + y[2] + " " + x[3] + " " + y[3]);
            } else {
                System.out.println("nenhum");
            }
            testes++;
            System.out.println();

        }

        
    }

    public static int lerInt() {
        return LER.nextInt();
    }
}
