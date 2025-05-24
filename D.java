
import java.util.Scanner;

public class D{
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int x = LER.nextInt();
        String estadoIsolado = LER.next();
        char[] a = estadoIsolado.toCharArray();
        String codicoesNormais = LER.next();
        char[] b = codicoesNormais.toCharArray();
        double contIsolados = 0;
        double contNormais = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == '*'){
                contIsolados++;
            }
            if(b[i] == '*'){
                contNormais++;
            }
        }   

        double result = 1.0 - (contNormais / contIsolados);
        System.out.printf("%.2f\n", result);


    }
}