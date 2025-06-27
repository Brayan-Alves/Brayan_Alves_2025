import java.util.*;

public class set {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        HashSet<String> fodasse = new HashSet<>();
        int n = 5;
        for (int i = 0; i < n; i++) {
            fodasse.add(LER.next());
        }
        System.out.println(fodasse);
    }
}
