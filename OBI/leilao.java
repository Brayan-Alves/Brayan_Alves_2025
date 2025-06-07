package OBI;

import java.util.Scanner;

public class leilao {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int x = LER.nextInt();
        String[][] leilao = new String[x][2];
        for (int i = 0; i < leilao.length; i++) {
            for (int j = 0; j < leilao[0].length; j++) {
                leilao[i][j] = LER.next();
            }
        }

        for (int i = 0; i < leilao.length; i++) {
            for (int j = leilao.length-1; j >0; j--) {
                if(Integer.parseInt(leilao[j][1]) > Integer.parseInt(leilao[j-1][1])){
                    String[] temp = leilao[j];
                    leilao[j] = leilao[j-1];
                    leilao[j-1] = temp;
                }
            }
        }

        System.out.printf("%s\n%s",leilao[0][0], leilao[0][1]);
        
    }
}
