package BEECROWD;

import java.util.Scanner;

public class picos_e_vales{
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int[] picosVales = new int[LER.nextInt()];
        int resp = 0;
        for (int i = 0; i < picosVales.length; i++) {
            picosVales[i] = LER.nextInt();
        }

        boolean seMaior = false;
        if(picosVales[0] > picosVales[1]){
            seMaior = true;
        }

        for (int i = 0; i < picosVales.length - 1; i++) {
            if(seMaior){
                if(picosVales[i] > picosVales[i+1]){
                    resp = 1;
                    seMaior = !seMaior;
                }else{
                    resp = 0;
                    break;
                }
            }else{
                if(picosVales[i] < picosVales[i+1]){
                    resp = 1;
                    seMaior = !seMaior;
                }else{
                    resp = 0;
                    break;
                }
            }
        }

        System.out.println(resp);
    }
}