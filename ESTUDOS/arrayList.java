import java.util.*;

public class arrayList {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        ArrayList<Integer> listSim = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listSim.add(LER.nextInt());
        }
        System.out.println(listSim);
        Collections.sort(listSim);
        System.out.println(listSim);

        //.get(INDEX) muda um elemneto de um certo index da lista
        //.add(INDEX(se não colocar adiciona no ultimo), ELEMENTO) adicona um elemento na lista
        //.remove remove sim
        listSim.getFirst();
        
    }

    
}
