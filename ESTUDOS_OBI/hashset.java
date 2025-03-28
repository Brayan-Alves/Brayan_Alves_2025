package ESTUDOS_OBI;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        //declaração
        HashSet<String> hashset = new HashSet<String>();

        //adição de elementos
        hashset.add("Sim");
        hashset.add("Não");
        System.out.println(hashset);

        //verificação
        //".contains()" verifica se o elemnto esta no set
        //".remove()" remove o elemento do set
        hashset.remove("Não");
        if(hashset.contains("Não")){
            System.out.println("O elemento está presente");
        }else{
            System.out.println("Elemento não encontrado");
        }

        //outros comandos
        //".clear()" remove todos os elmentos  do conjunto
        //".isEmpty()" verifica se o elemto esta no conjunto
    }
    
}
