package OBI_2024;

import java.util.Scanner;

public class trio {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int x = LER.nextInt();
        int[] palitinhos = new int[x];
        int resp = 0;
        for (int i = 0; i < palitinhos.length; i++) {
            palitinhos[i] = LER.nextInt();
        }
        for (int i = 0; i < palitinhos.length-2; i++) {
            for (int j = i+1; j < palitinhos.length-1; j++) {
                for (int j2 = j+1; j2 < palitinhos.length; j2++) {
                    if(palitinhos[i] + palitinhos[j] > palitinhos[j2]){
                        if (palitinhos[j] + palitinhos[j2] > palitinhos[i]) {
                            if(palitinhos[j2] + palitinhos[i] > palitinhos[j]){
                                resp++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(resp);
    }
}
