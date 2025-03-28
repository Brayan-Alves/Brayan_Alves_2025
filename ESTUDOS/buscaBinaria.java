
public class buscaBinaria {
    public static void main(String[] args) {
        
        int[] vet = {1, 3, 5, 8, 13, 49, 51, 83, 99, 109};
        int x = 51;
        int meio = vet.length / 2;

        for (int i = meio; i < vet.length; i++) {
            if(vet[i] > 51){
                i = meio;
            }else if(vet[i] < 51){
                meio += meio / 2;
                i = meio - 1;
            }else{
                System.out.println("Achei " + x);
            }
        }



    }
}
