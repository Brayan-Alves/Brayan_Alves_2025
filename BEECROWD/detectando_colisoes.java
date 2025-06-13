package BEECROWD;

import java.util.*;

public class detectando_colisoes {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int xA1 = LER.nextInt();
        int yA1 = LER.nextInt();

        int xA2 = LER.nextInt();
        int yA2 = LER.nextInt();

        int xB1 = LER.nextInt();
        int yB1 = LER.nextInt();

        int xB2 = LER.nextInt();
        int yB2 = LER.nextInt();

        if(xB1 > xA2){
            System.out.println(0);
        }else if(xB2 < xA1){
            System.out.println(0);
        }else if(yB1 > yA2){
            System.out.println(0);
        }else if(yB2 < yA1){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
}
