import java.util.Random;

public class MinMax3 {
    final static Random RD = new Random();
    public static void main(String[] args) {
        
        int[] vetA = gerarVetorRandom(10, 101);
        int max = 0;
        int min = 0;
        int fimDoAnel = 0;

        if(vetA.length % 2 != 0){
            System.out.println("O vetor deve ter um tamanho par!");
        }else{
            fimDoAnel = vetA.length - 1;
        }

        if(vetA[0] > vetA[1]){
            max = vetA[0];
            min = vetA[1];
        }else{
            max = vetA[1];
            min = vetA[0];
        }

        
        for (int i = 2; i < fimDoAnel; i+=2) {
            if(vetA[i] > vetA[i + 1]){
                if(vetA[i] > max){
                    max = vetA[i];
                }
                if(vetA[i + 1] < min){
                    min = vetA[i + 1];
                }
            }else{
                if(vetA[i + 1] > max){
                    max = vetA[i + 1];
                }
                if(vetA[i] < min){
                    min = vetA[i];
                }
            }
        }

        System.out.println("Maior = " + max);
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
