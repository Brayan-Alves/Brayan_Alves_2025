package BEECROWD;

import java.util.Scanner;

public class meteoros {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        int[] x = new int[3]; // 0, 1 permanentes | 2 temporarios
        int[] y = new int[3];
        int testes = 1;

        while (true) {

            x[0] = lerInt();
            y[0] = lerInt();
            x[1] = lerInt();
            y[1] = lerInt();

            if(x[0] == y[0] && y[0] == x[1] && x[1] == y[1] && y[1] == 0){
                break;
            }
            
            int meteorosDentro = 0;
            int k = lerInt();

            for (int i = 0; i < k; i++) {
                x[2] = lerInt();
                y[2] = lerInt();

                if(verificarSeIntercede(x, y)){
                    meteorosDentro++;
                }
            }

            System.out.println("Teste " + testes);
            System.out.println(meteorosDentro);
            testes++;


            
        }
    }

    public static int lerInt(){
        return LER.nextInt();
    }

    public static boolean verificarSeIntercede(int[] x, int[] y){
        boolean seIntercede = false;

        if(x[2] >= x[0] && x[2] <= x[1]){
            if(y[2] <= y[0] && y[2] >= y[1]){
                seIntercede = true;
            }
        }

        return seIntercede;
    }
}
