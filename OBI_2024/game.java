package OBI_2024;

import java.util.Scanner;

public class game{
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int x = LER.nextInt();
        int resp = 1;
        String direcoes = LER.next();
        for (int i = 0; i < x; i++) {
            char direcao = direcoes.charAt(i);
            if(direcao == 'E'){
                resp *= 2;
            }else{
                resp = (resp * 2) + 1;
            }
        }
        System.out.println(resp);
    }
}