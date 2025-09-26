package SIMULADO;

import java.util.Scanner;
import java.util.HashSet;

public class dijkstra{
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        HashSet<String> joias = new HashSet<>();
        while (LER.hasNext()) {
            joias.add(LER.next());
        }
        System.out.println(joias.size());
    }
}