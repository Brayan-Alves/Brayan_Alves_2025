package GRAFO;

import java.util.*;

class Grafo {
    // Variáveis de instância
    private final int vertices;        // Número total de vértices no grafo
    private final List<List<int[]>> adj;  // Lista de adjacência para representar o grafo

    // Construtor do grafo
    public Grafo(int vertices) {
        this.vertices = vertices;  // Armazena o número de vértices
        // Inicializa a lista de adjacência com listas vazias para cada vértice
        adj = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());  // Adiciona uma lista vazia para cada vértice
        }
    }

  
    public void adicionarAresta(int origem, int destino, int peso) {
        // Adiciona a aresta nos dois sentidos (grafo não-direcionado)
        adj.get(origem).add(new int[]{destino, peso});  // Origem → Destino
        adj.get(destino).add(new int[]{origem, peso});  // Destino → Origem
    }

   
    public int[] dijkstra(int inicio) {
        int[] distancia = new int[vertices];       // Armazena as distâncias mínimas
        boolean[] visitados = new boolean[vertices]; // Controla quais vértices já foram visitados
        // Fila de prioridade para selecionar sempre o vértice com menor distância atual
        PriorityQueue<int[]> fila = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));

        // Inicializa todas as distâncias como "infinito" (Integer.MAX_VALUE)
        Arrays.fill(distancia, Integer.MAX_VALUE);
        distancia[inicio] = 0;  // A distância do vértice inicial para ele mesmo é 0
        fila.add(new int[]{inicio, 0});  // Adiciona o vértice inicial na fila

        while (!fila.isEmpty()) {
            int[] atual = fila.poll();  // Remove o vértice com menor distância da fila
            int verticeAtual = atual[0];  // Obtém o número do vértice

            if (visitados[verticeAtual]) continue;  // Se já foi visitado, pula para o próximo
            visitados[verticeAtual] = true;  // Marca o vértice como visitado

            // Percorre todos os vizinhos do vértice atual
            for (int[] vizinho : adj.get(verticeAtual)) {
                int verticeVizinho = vizinho[0];  // Número do vértice vizinho
                int peso = vizinho[1];            // Peso da aresta para o vizinho
                int novaDistancia = distancia[verticeAtual] + peso;  // Calcula nova distância

                // Se achou um caminho mais curto para o vizinho
                if (novaDistancia < distancia[verticeVizinho]) {
                    distancia[verticeVizinho] = novaDistancia;  // Atualiza a distância
                    fila.add(new int[]{verticeVizinho, novaDistancia});  // Adiciona na fila
                }
            }
        }
        return distancia;  // Retorna o array com as distâncias mínimas calculadas
    }

    // Método principal para testar a implementação
    public static void main(String[] args) {
        // Cria um grafo com 5 vértices (0 a 4)
        Grafo grafo = new Grafo(5);
        
        // Adiciona as arestas do grafo
        grafo.adicionarAresta(0, 1, 10);  // Vértice 0 conectado ao 1 com peso 10
        grafo.adicionarAresta(0, 2, 3);   // Vértice 0 conectado ao 2 com peso 3
        grafo.adicionarAresta(1, 2, 1);   // E assim por diante...
        grafo.adicionarAresta(1, 3, 2);
        grafo.adicionarAresta(2, 3, 8);
        grafo.adicionarAresta(2, 4, 2);
        grafo.adicionarAresta(3, 4, 7);

        // Executa Dijkstra a partir do vértice 0
        int[] distancia = grafo.dijkstra(0);
        
        // Imprime os resultados
        System.out.println("Distâncias a partir do vértice 0:");
        for (int i = 0; i < distancia.length; i++) {
            System.out.println("Vértice " + i + ": " + distancia[i]);
        }
    }
}
