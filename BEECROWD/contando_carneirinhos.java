package BEECROWD;

import java.util.*;

public class contando_carneirinhos {
    public static Scanner LER =  new Scanner(System.in);
    public static void main(String[] args) {
        int x = LER.nextInt();

        for (int i = 0; i < x; i++) {
            
            int n = LER.nextInt();
            HashSet<Integer> carneirinhos = new HashSet<>();
            for (int j = 0; j < n; j++) {
                carneirinhos.add(LER.nextInt());
            }
            System.out.println(carneirinhos.size());
        }
    }   
}
