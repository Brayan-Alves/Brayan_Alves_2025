package LISTA;

public class ListaDuplamenteEncadeada {
    private No primeiro;
    private No ultimo;
    private No anterior;
    private int tamanho = 0;

    public ListaDuplamenteEncadeada() {
    }

    public No getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public void addInicio(int elemento){
        No no = new No();
        no.setElemento(elemento);
        if (tamanho==0){
            ultimo = no;
            primeiro = no;
        }else{
            no.setProximo(primeiro);
            primeiro.setProximo(no);
            primeiro = no;
        }
        no.setAnteriro(null);
        tamanho++;

    }

    public void addFim(int elemento){
        No no = new No();
        no.setElemento(elemento);
        if(tamanho == 0){
            primeiro = no;
            ultimo = no;
        }else{
            no.setAnteriro(ultimo);
            ultimo.setProximo(no);
            ultimo = no;
        }
        no.setProximo(null);
        tamanho++;
    }

    public void addPosicao(int pos, int elemento){
        if (pos == 0){
            addInicio(elemento);
            return;
        }
        if (pos == tamanho){
            addFim(elemento);
            return;
        }

        No no = new No();
        no.setElemento(elemento);
        
        if(pos < tamanho/2){
            No atual = primeiro;
            for (int i = 0; i < pos-1; i++) {
                atual = atual.getProximo();
            }
            no.setProximo(atual);
            
        }
        
        // No no = new No();
        // no.setElemento(elemento);
        // no.setProximo(null);
        // No atual = primeiro;

        for(int i=0; i<pos-1;i++){
            atual=atual.getProximo();
        }
        // no.setProximo(atual.getProximo());
        // atual.setProximo(no);
        // tamanho++;

    }







    public void show(){
        No iterator = primeiro;
        System.out.println("Lista");
        for (int i = 1; i <= tamanho; i++) {
            System.out.println(iterator.getElemento()+" ");
            iterator = iterator.getProximo();
        }
    }

}
