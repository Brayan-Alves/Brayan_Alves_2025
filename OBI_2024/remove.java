package OBI_2024;

import java.util.Scanner;

public class remove {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        String num = LER.nextLine();
        int resp = 0;
        while (true) {
            
            if(num.equals("0")){
                System.out.println(resp);
                break;
            }

            int maiorNum = Integer.MIN_VALUE;
            for (int i = 0; i < num.length(); i++) {
                if(Character.valueOf(num.charAt(i)) % 48 > maiorNum){
                    maiorNum = Character.valueOf(num.charAt(i)) % 48;
                }
            }
            int numInt = Integer.parseInt(num) - maiorNum;
            num = Integer.toString(numInt);
            resp++;
        }
    }
}
