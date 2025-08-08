import java.util.Arrays;
import java.util.Scanner;

public class bee_1171 {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int[] vet = new int[LER.nextInt() + 1];
        vet[vet.length-1] = 2001;
        for (int i = 0; i < vet.length-1; i++) {
            vet[i] = LER.nextInt();
        }
        Arrays.sort(vet);

        int cont = 1;
        int numAtu = vet[0];
        for (int i = 1; i < vet.length; i++) {
            if(vet[i] != numAtu){
                System.out.println(numAtu + " aparece " + cont + " vez(es)");
                cont = 1;
                numAtu = vet[i];
            }else{
                cont++;
            }
        }
    }
}
