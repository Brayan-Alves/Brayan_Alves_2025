package OBI_2022;


import java.util.Scanner;

public class piramide {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int x = LER.nextInt();
        int[][] piramide = new int[x][x];
        for (int i = 0; i < piramide.length; i++) {
            for (int j = 0; j < piramide.length; j++) {
                if(i+1 == 1 || j+1 == 1 || i-piramide.length+2 == 1 || j-piramide.length+2 == 1){
                    piramide[i][j] = 1;
                }else if(i+1 == 2 || j+1 == 2 || i-piramide.length+3 == 1 || j-piramide.length+3 == 1){
                    piramide[i][j] = 2;
                }else if(i+1 == 3 || j+1 == 3 || i-piramide.length+4 == 1 || j-piramide.length+4 == 1){
                    piramide[i][j] = 3;
                }else{
                    piramide[i][j] = 4;
                }
            }
        }
        for (int i = 0; i < piramide.length; i++) {
            for (int j = 0; j < piramide.length; j++) {
                System.out.print(piramide[i][j]);
            }
            System.out.println();
        }
    }
}
