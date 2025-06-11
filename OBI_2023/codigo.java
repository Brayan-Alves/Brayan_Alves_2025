package OBI_2023;

import java.util.Scanner;

public class codigo {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        LER.nextInt();
        String str = LER.next();
        int cont = 1;
        for (int i = 0; i < str.length(); i++) {
            
            if(i != str.length()-1){
                if(str.charAt(i) == str.charAt(i+1)){
                    cont++;
                }else{
                    System.out.print(cont+ " " +str.charAt(i) + " ");
                    cont = 1;
                }
            }else{
                System.out.println(cont+ " " +str.charAt(i));
            }
        }
    }
}
