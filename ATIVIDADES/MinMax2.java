package OBI_ATIVIDADES;

import java.util.Random;

public class MinMax2 {
    final static Random RD = new Random();
    public static void main(String[] args) {
        
        int[] vetA = gerarVetorRandom(10, 101);
        int max = vetA[0];
        int min = vetA[0];

        for (int i = 1; i < vetA.length; i++) {
            if(vetA[i] > max){
                max = vetA[i];
            }else if(vetA[i] < min){
                max = vetA[i];
            }
        }

        System.out.println("Mior = " + max);
        System.out.println("Menor = " + min);

    }

    public static int[] gerarVetorRandom(int k, int x){
        int[] vet = new int[k];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = RD.nextInt(x);
        }
        return vet;
    }
}