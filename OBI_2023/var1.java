package OBI_2023;


import java.util.Scanner;

public class var1 {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int x = LER.nextInt();
        int y = LER.nextInt();


        if((x >= -8 && x <= 8) && (y >= 0 && y <= 8)){
            System.out.println("S");
        }else{
            System.out.println("N");
        }
    }
}
