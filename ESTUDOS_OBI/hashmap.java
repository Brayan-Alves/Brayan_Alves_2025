package ESTUDOS_OBI;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {

        //HASHMAP: é uma estrutura de dados permite armazenar pares de chave e valor
        
        //DECLARAÇÃO
        Map<String,Integer> hashmap = new HashMap<String,Integer>();

        //ADIÇÂO DE ELEMENTOS
        //".put()"
        //"Brayan" é a "Key"
        //"15" é "Value"
        hashmap.put("Brayan",15);
        hashmap.put("Rodrigo",16);
        hashmap.put("Pedro",14);

        //PROCURA
        //".containsKey()" para procurar por um valor dentro da tabela
        //".containsValue()" para procurar por uma chave
        //".get()" para devolver o valor da chave correspondente
        String aluno = "Brayan";
        if(hashmap.containsKey(aluno)){
            System.out.println("Aluno " + aluno + " tem " + hashmap.get(aluno) + " anos.");
        }

        System.out.println();

        //FOR EACH - percorrer o hashmap
        //".keySet()" retorna um Set com todas as chaves
        for (String str : hashmap.keySet()) {
            Integer x = hashmap.get(str);
            System.out.println("Aluno " + str + " tem " + x + " anos");
        }

        System.out.println();

        //REMOVER ELEMNTOS
        //".remove()"
        hashmap.remove("Pedro");
        for (String str : hashmap.keySet()) {
            Integer x = hashmap.get(str);
            System.out.println("Aluno " + str + " tem " + x + " anos");
        }

        System.out.println();

        //IMPRIMIR
        System.out.println(hashmap);

        //OUTROS COMANDOS
        //".size()" retorna o tamanho do hashmap
        //".clear()" tira todos os elemntos do hashmap
        //".putAll()" junta dois hashmaps
        
    }
    
}
