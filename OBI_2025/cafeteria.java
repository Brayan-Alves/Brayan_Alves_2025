package OBI_2025;

import java.util.Scanner;

public class cafeteria {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int volMinLeite = LER.nextInt();
        int volMaxLeite = LER.nextInt();
        int capacidadeXicara = LER.nextInt();
        int volDoseCafe = LER.nextInt();

        while (true) {
            if(capacidadeXicara - volDoseCafe > volMaxLeite){
                capacidadeXicara -= volDoseCafe;
            }else{
                break;
            }
        }
        if(capacidadeXicara - volDoseCafe < volMinLeite){
            System.out.println("N");
        }else{
            System.out.println("S");
        }
    }
}
