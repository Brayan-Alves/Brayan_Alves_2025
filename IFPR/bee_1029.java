import java.util.Scanner;

public class bee_1029{
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int x = LER.nextInt();
        for (int i = 0; i < x; i++) {
            int y = LER.nextInt();
            int[] calls = new int[1];
            int resp = fiboRec(y, calls);
            System.out.printf("fib(%d) = %d calls = %d\n", y, calls[0], resp);
        }
    }

    public static int fiboRec(int x, int[] calls){
        if(x == 0){
            return 0;
        }else if(x == 1){
            return 1;
        }else{
            calls[0] += 2;
        }
        

        return fiboRec(x-1, calls) + fiboRec(x-2, calls);
    }
}