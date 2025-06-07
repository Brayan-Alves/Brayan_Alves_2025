package OBI;

import java.util.Scanner;

public class toupeira {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int n = LER.nextInt();
        int m = LER.nextInt();
        boolean passeioPossivel = false;
        int resp = 0;
        int[][] mapa = new int[n][n];
        for (int i = 0; i < m; i++) {
            int x = LER.nextInt();
            int y = LER.nextInt();
            mapa[x-1][y-1] = 1;
            mapa[y-1][x-1] = 1;
        }
        int passeios = LER.nextInt();
        for (int i = 0; i < passeios; i++) {
            int p = LER.nextInt();
            int[] rota = new int[p];
            for (int j = 0; j < rota.length; j++) {
                rota[j] = LER.nextInt();
            }
            for (int j = 0; j < rota.length-1; j++) {
                if(mapa[rota[j]-1][rota[j+1]-1] == 1){
                    passeioPossivel = true;
                }else{
                    passeioPossivel = false;
                    break;
                }
            }
            if(passeioPossivel){
                resp++;
            }
            
        }

        System.out.println(resp);
        
    }
}
