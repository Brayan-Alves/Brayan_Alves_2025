import java.util.Random;

public class ex {

    public static Random RD = new Random();
    public static void main(String[] args) {

        int[] vet = new int[100000];

        long startA = System.currentTimeMillis();

        vet = gerarVetorInt(vet);
        imprimirVetorInt(vet);

        long endA = System.currentTimeMillis();
        long timeA = endA - startA;

        long startB = System.currentTimeMillis();
        int max = encontratMax(vet);
        long endB = System.currentTimeMillis();
        long timeB = endB - startB;

        System.out.println("Maior = " + max);
        System.out.println("Tempo para gerar e imprimir = " + timeA );
        System.out.println("Tempo para encontar maior = " + timeB );
        
    }

    public static int[] gerarVetorInt(int[] vet){
        for (int i = 0; i < vet.length; i++) {
            vet[i] = RD.nextInt(51);
        }
        return vet;
    }

    public static void imprimirVetorInt(int[] vet){
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();
    }

    public static int encontratMax(int[] vet){
        int max = vet[0];
        for (int i = 1; i < vet.length; i++) {
            if(vet[i] > max){
                max = vet[i];
            }
        }
        return max;
    }
}
