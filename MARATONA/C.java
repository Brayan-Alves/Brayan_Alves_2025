package MARATONA;

import java.util.Scanner;
import java.util.LinkedList;

public class C {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) { // 0 = 1        
        int x = LER.nextInt();
        int[] polinomio = new int[x+1];
        for (int i = 0; i < polinomio.length; i++) {
            polinomio[i] = LER.nextInt();
        }
        int[] calculo = new int[21];
        int tamAtu = 0;
        for (int i = 0; i < polinomio.length; i++) {
            if(polinomio[i] == 1){
                calculo[i] = polinomio.length-1-i;
                tamAtu++;
            }
        }

        int cont = 0;

        while (true) {
            
            if(calculo[0] == 0){
                break;
            }

            for (int i = 0; i < tamAtu; i++) {
                if(calculo[i] == 0){
                    int tamAtuLoop = tamAtu;
                    for (int j = 0; j < tamAtuLoop; j++) {
                        if(calculo[j] > 0){
                            calculo[tamAtu] = calculo[j]+1;
                            tamAtu++;
                        }else{
                            calculo[tamAtu] = 1;
                            tamAtu++;
                        }
                    }
                    calculo[tamAtu] = 0;
                    tamAtu++;
                    int cont0 = 0;

                    for (int j = 0; j < tamAtu; j++) {
                        if(calculo[j] == 0){
                            cont0++;
                        }
                    }

                    if(cont0 == 2){
                        cont++;
                        for (int j = 0; j < tamAtu; j++) {
                            if(calculo[j] == 0){
                                calculo[j] = -1;
                            }
                        }
                    }
                }
            }

            for (int i = 0; i < tamAtu; i++) {
                if(calculo[i] > 0){
                    calculo[i] -=1;
                    cont++;
                }else if(calculo[i]== 0){
                    calculo[i] = 0;
                    cont++;
                }
            }


        }

        System.out.println(cont);
        
    }
}
