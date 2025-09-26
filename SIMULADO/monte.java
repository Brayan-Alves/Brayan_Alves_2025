package SIMULADO;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class monte {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int x = LER.nextInt();
        int[] dist = new int[x];
        int[] tonalidade = new int[x];

        for (int i = 0; i < x; i++) {
            dist[i] = LER.nextInt();
            tonalidade[i] = LER.nextInt();
        }

        int[] distC = dist.clone();
        Arrays.sort(distC);
        int[] tonalidadeC = tonalidade.clone();
        Arrays.sort(tonalidadeC);
        int[] tonalidadeCA = new int[x];
        for (int i = 0; i < tonalidadeC.length; i++) {
            tonalidadeCA[i] = tonalidadeC[tonalidadeC.length-i-1];
        }

        
        for (int i = 0; i < distC.length; i++) {
            for (int j = 0; j < dist.length; j++) {
                if(distC[i] == dist[j]){
                    if(tonalidadeCA[i] == tonalidade[j]){
                        continue;
                    }else{
                        System.out.println("N");
                        System.exit(0);
                    }
                }
            }
        }

        System.out.println("S");
    }
}
