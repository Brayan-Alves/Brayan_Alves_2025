package OBI_2023;

import java.util.Scanner;

public class prefixo {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        LER.nextInt();
        String strA = LER.next();
        LER.nextInt();
        String strB = LER.next();
        int cont = 0;
        for (int i = 0; i < strA.length(); i++) {
            if(strA.charAt(i) == strB.charAt(i)){
                cont++;
            }else{
                break;
            }
        }
        System.out.println(cont);
    }
}
