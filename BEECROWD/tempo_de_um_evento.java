package BEECROWD;

import java.util.Scanner;

public class tempo_de_um_evento {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {


        int diminuir = 0;
        String[] linha1 = LER.nextLine().split(" ");
        String[] linha2 = LER.nextLine().split(" ");
        int diaIni = Integer.parseInt(linha1[1]);
        int[] tempoIni = {Integer.parseInt(linha2[0]), Integer.parseInt(linha2[2]), Integer.parseInt(linha2[4])};
        linha1 = LER.nextLine().split(" ");
        linha2 = LER.nextLine().split(" ");
        int diaFinal = Integer.parseInt(linha1[1]);
        int[] tempoFinal = {Integer.parseInt(linha2[0]), Integer.parseInt(linha2[2]), Integer.parseInt(linha2[4])};
        
        int[] tempoEvento = new int[4]; //dia, hora, minuto, segundo

        if(tempoFinal[2] - tempoIni[2] >= 0){ //segundos
            tempoEvento[3] = tempoFinal[2] - tempoIni[2];
        }else{
            tempoEvento[3] = 60 - tempoIni[0] - tempoFinal[0];
            diminuir = 1;
        }

        if(tempoFinal[1] - tempoIni[1] >= 0){ //minutos
            tempoEvento[2] = tempoFinal[1] - tempoIni[1] - diminuir;
            diminuir = 0;
        }else{
            tempoEvento[2] = 60 - (tempoIni[1] - tempoFinal[1]) + diminuir;
            diminuir = 1;
        }

        if(tempoFinal[0] - tempoIni[0] >= 0){ //horas
            tempoEvento[1] = tempoFinal[0] - tempoIni[0] - diminuir;
            diminuir = 0;
        }else{
            tempoEvento[1] = 24 - (tempoIni[0] - tempoFinal[0]) + diminuir;
            diminuir = 1;
        }

        if(diaFinal - diaIni >= 0){ //horas
            tempoEvento[0] = diaFinal - diaIni - diminuir;
            diminuir = 0;
        }

        for (int i = 0; i < tempoEvento.length; i++) {
            if(i == 0){
                System.out.printf("%d dia(s)\n",tempoEvento[i]);
            }else if(i == 1){
                System.out.printf("%d hora(s)\n", tempoEvento[i]);
            }else if(i == 2){
                System.out.printf("%d minuto(s)\n", tempoEvento[i]);
            }else{
                System.out.printf("%d segundo(s)\n", tempoEvento[i]);
            }
        }

    }
}
