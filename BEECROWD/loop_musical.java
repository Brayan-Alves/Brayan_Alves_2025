package BEECROWD;

import java.util.Scanner;

public class loop_musical {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        while (true) { //LOOOOOOOOOOOOOOOOOOOOop
            
            int n = LER.nextInt();
            int picos = 0;
            int altitudePasssadaA = 0;
            int altitudePasssadaB = 0;
            boolean inicioLoop = false;  //true = cima   false = baixo
            boolean fimLoop = false;     //true = baixo  false = cima


            if(n == 0){
                break;
            }

            int[] altitudes = new int[n];

            for (int i = 0; i < altitudes.length; i++) {
                altitudes[i] = LER.nextInt();
            }

            if(altitudes[0] > altitudes[1]){
                inicioLoop = true;
            }
            if(altitudes[altitudes.length - 2] > altitudes[altitudes.length - 1]){
                fimLoop = true;
            }

            altitudePasssadaA = altitudes[0];
            altitudePasssadaB = altitudes[1];
            picos++;

            for (int i = 2; i < altitudes.length; i++) {
                if(altitudePasssadaA > altitudePasssadaB){
                    if(altitudes[i] > altitudePasssadaB){
                        picos++;
                    }
                }else{
                    if(altitudes[i] < altitudePasssadaB){
                        picos++;
                    }
                }
                altitudePasssadaA = altitudePasssadaB;
                altitudePasssadaB = altitudes[i];
            }

            if(inicioLoop && fimLoop || !inicioLoop && !fimLoop){
                picos++;
            }

            System.out.println(picos);
                
        } 
    }   
}

