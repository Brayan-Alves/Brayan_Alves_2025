package BEECROWD;

import java.util.Scanner;

public class loop_musical {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        while (true) { 
            
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

            altitudes = lerVetInt(altitudes);
            inicioLoop = verificarInicioDoLoop(altitudes);
            fimLoop = verificarFimDoLoop(altitudes);

            altitudePasssadaA = altitudes[0];
            altitudePasssadaB = altitudes[1];
            picos++;

            picos = contarPicos(altitudes, altitudePasssadaA, altitudePasssadaB, picos);

            if(inicioLoop && fimLoop || !inicioLoop && !fimLoop){
                picos++;
            }

            System.out.println(picos);
                
        } 
    }   

    public static int[] lerVetInt(int[] vet){
        for (int i = 0; i < vet.length; i++) {
            vet[i] = lerInt();
        }
        return vet;
    }

    public static int lerInt(){
        return LER.nextInt();
    }

    public static boolean verificarInicioDoLoop(int[] altitudes){
        boolean inicioLoop = false;

        if(altitudes[0] > altitudes[1]){
            inicioLoop = true;
        }

        return inicioLoop;
    }

    public static boolean verificarFimDoLoop(int[] altitudes){
        boolean fimLoop = false;

        if(altitudes[altitudes.length - 2] > altitudes[altitudes.length - 1]){
            fimLoop = true;
        }

        return fimLoop;
    }

    public static int contarPicos(int[] altitudes, int altitudePasssadaA, int altitudePasssadaB, int picos){
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

        return picos;
    }
}

