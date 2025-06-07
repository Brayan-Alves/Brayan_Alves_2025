package OBI_2024;

import java.util.Scanner;

public class ogro {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int e = LER.nextInt();
        int d = LER.nextInt();
        if(e > d){
            System.out.println(e+d);
        }else{
            System.out.println(2*(d-e));
        }
    }
}
