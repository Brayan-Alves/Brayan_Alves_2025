package OBI_2022;


import java.util.Scanner;

public class tanque {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int c = LER.nextInt();
        int d = LER.nextInt();
        int t = LER.nextInt();
        double result = ((double)d / (double)c) - t;
        if(result < 0){
            System.out.println(0.0);
        }else{
            System.out.printf("%.1f\n", result);
        }
    }
}
