import java.util.ArrayList;
import java.util.Scanner;

public class F {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        ArrayList<String> lista = new ArrayList<>();
        String posicoes = "";
        int numT = LER.nextInt();
        int[] numeros = new int[numT];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = LER.nextInt();
        }
        int results = LER.nextInt();
        int[] resultsVet = new int[results];
        for (int i = 0; i < resultsVet.length; i++) {
            resultsVet[i] = LER.nextInt();
        }
        int cont = 0;
        int soma = 0;

        for (int p = 0; p < resultsVet.length; p++) {
            lista.clear();
            cont = 0;
            for (int i = 0; i < numeros.length; i++) {
                int exeA = i;
                for (int j = 0; j < numeros.length - 2; j++) {
    
                    int exeB = j;
                    while(j == exeA){
                        j++;
                        exeB = j;
                    }
                    for (int k = 0; k < numeros.length; k++) {
                        int exeC = k; 
                        while (k == exeB || k == exeA){
                            k++;
                            exeC = k;
                        }
                        for (int l = 0; l < numeros.length; l++) { 
                            while (l == exeC || l == exeB || l == exeA){
                                l++;
                            }
                            soma = somar(numeros, i, j, k, l);
                            cont = verificarA(soma, resultsVet, cont, posicoes, i, j, k, l, lista, p);
                        }
                    }
                    
                }
            }
            System.out.println(cont);
        }

       
        
    }

    // public static int verificarSim(int i, int j, int[] numeros, int[] resultsVet, int cont){
    //     int soma = 0;
    //     if(i == resultsVet.length - 1 - 2){
    //         return verificarSim(i, j, numeros, resultsVet, cont);
    //     }else{
    //         soma = somar(numeros, j, i);
    //         cont = verificarA(soma, resultsVet, cont);
    //         return verificarSim(i, j + 1, numeros, resultsVet, cont);
    //     }

    // }

    public static int somar(int[] numeros, int i, int j, int k, int l){
        if(i > numeros.length- 1 || j > numeros.length - 1 || k > numeros.length - 1 || l > numeros.length - 1){
            return 0;
        }else{
            
            int soma = numeros[j] + numeros[i] + numeros[k] + numeros[l];
            return soma;
        }
        
    }

    public static int verificarA(int soma, int[] resultsVet, int cont, String posicoes, int i, int j, int k, int l, ArrayList<String> lista, int p){
    
            if(soma == resultsVet[p] ){
                posicoes = (i+"") + (j+"") + (k+"") + (l+"");
                if(!verificarB(posicoes, lista)){
                    lista.add(posicoes);
                    cont++;
                }
                
            }
            
        
        return cont;
    }

    public static boolean verificarB(String posicoes, ArrayList<String> lista){
        boolean bool = false;
        int cont = 0;
        for(String str: lista) {
            if (cont < 4) {
                cont = 0;
            }
            for (int i = 0; i < posicoes.length(); i++) {
                for (int j = 0; j < str.length(); j++) {
                    if (posicoes.charAt(i) == str.charAt(j)) {
                        cont++;
                    }
                }
            }
        }
        if (cont >= 4) {
            bool = true;
        }
        return bool;
    }


}
