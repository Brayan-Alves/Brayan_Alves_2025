package OBI_2024;

import java.util.Scanner;

public class alfabeto {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        LER.nextInt();
        LER.nextInt();
        boolean resp = true;
        int cont = 0;
        String alfabeto =LER.next();
        String frase = LER.next();
        for (int i = 0; i < frase.length(); i++) {
            cont = 0;
            for (int j = 0; j < alfabeto.length(); j++) {
                if(frase.charAt(i) == alfabeto.charAt(j)){
                    cont++;
                    break;
                }
            }
            if(cont == 0){
                resp = false;;
                break;
            }
        }
        if(resp){
            System.out.println("S");
        }else{
            System.out.println("N");
        }
    }
}
