package BEECROWD;


import java.util.Scanner;

public class carrega_ou_nao_carrega{
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int x = LER.nextInt();
        String numA = Integer.toBinaryString(x);
                
        x = LER.nextInt();
        String numB = Integer.toBinaryString(x);
        String numF = "";


        int i = 0;
        while (true) {
            if(numA.charAt(numA.length()-1-i) == '1' && (numB.charAt(numB.length()-1-i) == '1')){
                numF = "0"+numF;
            }else if(numA.charAt(numA.length()-1-i) == '0' && numB.charAt(numB.length()-1-i) == '0'){
                numF = "0"+numF;
            }else{
                numF = "1"+numF;
            }
            i++;
            if(numA.length() == i){
                break;
            }
        }

        int resp = Integer.parseInt(numF, 2);
        System.out.println(resp);


    }
}