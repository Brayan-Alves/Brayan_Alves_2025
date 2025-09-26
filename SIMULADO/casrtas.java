package SIMULADO;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class casrtas {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            int x = LER.nextInt();
            int y = LER.nextInt();

            if(x == 0 && y == 0){
                break;
            }

            HashSet<Integer> cartasA = new HashSet<>();
            HashSet<Integer> cartasB = new HashSet<>();

            for (int i = 0; i < x; i++) {
                cartasA.add(LER.nextInt());
            }

            for (int i = 0; i < y; i++) {
                cartasB.add(LER.nextInt());
            }



            HashSet<Integer> exclusivoA = new HashSet<>(cartasA);
            HashSet<Integer> exclusivoB = new HashSet<>(cartasB);


            exclusivoA.removeAll(cartasB);
            exclusivoB.removeAll(cartasA);
            System.out.println(Math.min(exclusivoA.size(), exclusivoB.size()));




        }
    }
}
