package OBI_2023;

import java.util.Scanner;

public class grupos {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int restricoes = 0;
        int estudantes = LER.nextInt();
        int duplasJuntas = LER.nextInt();
        int duplasSeparadas = LER.nextInt();
        int grupos = estudantes/3;
        int[][] duplas = new int[duplasJuntas][2];
        int[][] separacoes = new int[duplasSeparadas][2];
        int[][] gruposEscolhidos = new int[grupos][3];
        for (int i = 0; i < duplas.length; i++) {
            for (int j = 0; j < duplas[0].length; j++) {
                duplas[i][j] =LER.nextInt();
            }
        }
        for (int i = 0; i < separacoes.length; i++) {
            for (int j = 0; j < separacoes[0].length; j++) {
                separacoes[i][j] = LER.nextInt();
            }
        }
        for (int i = 0; i < gruposEscolhidos.length; i++) {
            for (int j = 0; j < gruposEscolhidos[0].length; j++) {
                gruposEscolhidos[i][j] = LER.nextInt();
            }
        }

        for (int i = 0; i < gruposEscolhidos.length; i++) {
            int membroA = gruposEscolhidos[i][0];
            int membroB = gruposEscolhidos[i][1];
            int membroC = gruposEscolhidos[i][2];

            for (int j = 0; j < duplas.length; j++) {
                if(membroA == duplas[j][0] || membroA == duplas[j][1]){
                    if(duplas[j][0] == membroB || duplas[j][0] == membroC || duplas[j][1] == membroC || duplas[j][1] == membroB){
                        continue;
                    }else{
                        restricoes++;
                    }
                }
                if(membroB == duplas[j][0] || membroB == duplas[j][1]){
                    if(duplas[j][0] == membroA || duplas[j][0] == membroC || duplas[j][2] == membroA || duplas[j][2] == membroC){
                        continue;
                    }else{
                        restricoes++;
                    }
                }
                if(membroC == duplas[j][0] || membroC == duplas[j][1]){
                    if(duplas[j][0] == membroA || duplas[j][0] == membroB || duplas[j][1] == membroA || duplas[j][1] == membroB){
                        continue;
                    }else{
                        restricoes++;
                    }
                }
            }

            for (int j = 0; j < separacoes.length; j++) {
                if(membroA == separacoes[j][0] || membroA == separacoes[j][1]){
                    if(separacoes[j][0] == membroB || separacoes[j][0] == membroC || separacoes[j][1] == membroB || separacoes[j][1] == membroC){
                        restricoes++;
                    }
                }
                if(membroB == separacoes[j][0] || membroB == separacoes[j][1]){
                    if(separacoes[j][0] == membroA || separacoes[j][0] == membroC || separacoes[j][1] == membroA || separacoes[j][1] == membroC){
                        restricoes++;
                    }
                }
                if(membroC == separacoes[j][0] || membroC == separacoes[j][1]){
                    if(separacoes[j][0] == membroA || separacoes[j][0] == membroB || separacoes[j][1] == membroA || separacoes[j][1] == membroB){
                        restricoes++;
                    }
                }
            }
        }
        System.out.println(restricoes/2);


    }
}
