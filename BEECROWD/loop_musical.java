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


            if(n == 0){
                break;
            }

            int[] altitudes = new int[n];

            for (int i = 0; i < altitudes.length; i++) {
                altitudes[i] = LER.nextInt();
            }

            if(altitudes.length == 2){
                picos += 1;
                if(altitudes[0] )
            }else{

        
            //     if(altitudes.length == 2){
            //     picos += 2;
            // }else{
                // picos += 1;
                // altitudePasssadaA = altitudes[0];
                // altitudePasssadaB = altitudes[1];

                // for (int i = 2; i < altitudes.length; i++) {
                //     if(altitudePasssadaA < altitudePasssadaB){
                //         if(altitudes[i] < altitudePasssadaB){
                //             picos++;
                //         }
                //     }else{
                //         if(altitudes[i] > altitudePasssadaB){
                //             picos++;
                //         }
                //     }
                //     altitudePasssadaA = altitudePasssadaB;
                //     altitudePasssadaB = altitudes[i];
                // }

                // if(altitudes[altitudes.length - 1] > altitudes[0]){
                //     picos++;
                // }else if(altitudes[altitudes.length - 1] < altitudes[0]){
                //     picos++;
                // }
                
            }

            System.out.println(picos);

            
        }   
    }
}
