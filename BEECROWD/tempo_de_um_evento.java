package BEECROWD;

import java.util.Scanner;

public class tempo_de_um_evento {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {


        
        String[] linha1 = LER.nextLine().split(" ");
        String[] linha2 = LER.nextLine().split(" ");
        int diaIni = Integer.parseInt(linha1[1]);
        int[] tempoIni = {Integer.parseInt(linha2[0]), Integer.parseInt(linha2[2]), Integer.parseInt(linha2[4])};
        linha1 = LER.nextLine().split(" ");
        linha2 = LER.nextLine().split(" ");
        int diaFinal = Integer.parseInt(linha1[1]);
        int[] tempoFinal = {Integer.parseInt(linha2[0]), Integer.parseInt(linha2[2]), Integer.parseInt(linha2[4])};
        
        int[] tempoEvento = new int[4]; //dia, hora, minuto, segundo

        

        int inicio = diaIni * 86400 + tempoIni[0] * 3600 + tempoIni[1] * 60 + tempoIni[2];
        int fim = diaFinal * 86400 + tempoFinal[0] * 3600 + tempoFinal[1] * 60 + tempoFinal[2];
        int duracao = fim - inicio;

        tempoEvento[0] = duracao / 86400;
        duracao %= 86400;
        tempoEvento[1] = duracao / 3600;
        duracao %= 3600;
        tempoEvento[2] = duracao / 60;
        duracao %= 60;
        tempoEvento[3] = duracao;

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
