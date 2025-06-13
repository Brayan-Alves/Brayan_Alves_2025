import IFPR.matriz;

public class num_prim{
    public static void main(String[] args) {
        
        // final int LIM_MAX = 1000;
        // int cont = 0;
        // for (int i = 0; i < LIM_MAX; i++) {
        //     cont = 0;
        //     for (int j = 1; j <= i; j++) {
        //         if(i % j == 0){
        //             cont++;
        //         }
        //         if(cont > 2){
        //             break;
        //         }
        //     }
        //     if(cont == 2){
        //         System.out.print(i + " ");
        //     }
        // }

        boolean[] vet = new boolean[100];
    
        for (int i = 2; i < vet.length; i++) {
            vet[i] = true;
        }

        for (int i = 2; i < vet.length; i++) {
            for (int j = i + 1; j < vet.length; j++) {
                if(j % i == 0 && vet[j]){
                    vet[j] = false;
                }
            }
        }

        for (int i = 0; i < vet.length; i++) {
            if(vet[i]){
                System.out.println(i);
            }
        }
        
    }
}