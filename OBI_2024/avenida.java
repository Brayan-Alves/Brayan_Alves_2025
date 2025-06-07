package OBI_2024;

import java.util.Scanner;

public class avenida {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int[] avenida = {0, 400, 800, 1200, 1600, 2000};
        int x = LER.nextInt();
        for (int i = 0; i < avenida.length; i++) {
            if(x < avenida[i]){
                int distA = avenida[i] - x;
                int distB = x - avenida[i-1];
                if(distA < distB){
                    System.out.println(distA);
                    break;
                }else{
                    System.out.println(distB);
                    break;
                }
            }
        }
    }
}
