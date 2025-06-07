package OBI;

import java.util.Scanner;

public class estoque {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] mat = new int[LER.nextInt()][LER.nextInt()];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = LER.nextInt();
            }
        }
        int vendas = 0;

        int n = LER.nextInt();
        for (int i = 0; i < n; i++) {
            int x = LER.nextInt();
            int y = LER.nextInt();
            if(mat[x-1][y-1] > 0){
                mat[x-1][y-1]--;
                vendas++;
            }
        }

        System.out.println(vendas);

    }
}
