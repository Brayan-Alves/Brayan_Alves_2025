package OBI_2025;

import java.util.Scanner;

public class festa {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int escola = LER.nextInt();
        int mercado = LER.nextInt();
        int loja = LER.nextInt();
        int percorrido = 0;

        if(Math.abs(escola - mercado) < Math.abs(escola - loja)){
            percorrido = Math.abs(escola - mercado);
            percorrido += Math.abs(mercado - loja);
            percorrido += Math.abs(loja - escola);
        }else{
            percorrido = Math.abs(escola - loja);
            percorrido += Math.abs(loja - mercado);
            percorrido += Math.abs(mercado - escola);
        }
        System.out.println(percorrido);
    }
}
