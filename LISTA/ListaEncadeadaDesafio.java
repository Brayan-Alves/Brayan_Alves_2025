package LISTA;

public class ListaEncadeadaDesafio {
    private No primeiro;

    public ListaEncadeadaDesafio() {
    }

    public No getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public void addInicio(int elemento){
        No no = new No();
        no.setElemento(elemento);
        primeiro = no;
        if(getTamanho() == 0){
            no.setProximo(null);
        }else{
            no.setProximo(primeiro);
            primeiro.setProximo(null);
            
        }

    }

    public void addFim(int elemento){
        No no = new No();
        no.setElemento(elemento);
        if(getTamanho() == 0){
            primeiro = no;
        }else{
            No atual = primeiro;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(no);
            no.setProximo(null);
        }
    }
    public void addPosicao(int pos, int elemento){
        if (pos == 0){
            addInicio(elemento);
            return;
        }
        

        No no = new No();
        no.setElemento(elemento);
       
        No atual = primeiro;
        for (int i = 0; i < pos-1; i++) {
            atual = atual.getProximo();
        }
        no.setProximo(atual.getProximo());
        atual.setProximo(no);
        
    }

    public void removeInicio(){
        No atual = primeiro.getProximo();
        primeiro.setProximo(null);
        atual.setAnterior(null);

    }

    public void removeFim(){
        No atual = primeiro;
        do {
            atual = atual.getProximo();
        } while (atual.getProximo() != null);
        atual.getAnterior();
        atual.setProximo(null);

    }

    public void removePosicao(int pos, int elemento){
        if(pos == 0){
            removeInicio();
        }

        No atual = primeiro;
        for (int i = 0; i < pos-1; i++) {
            atual = atual.getProximo();
        }
        atual.setProximo(atual.getProximo().getProximo());
    }


    public void show(){
        No iterator = primeiro;
        System.out.println("Lista");
        while (iterator.getProximo() != null) {
            System.out.println(iterator.getElemento()+" ");
            iterator = iterator.getProximo();
        }
        
    }

    public int getTamanho(){
        if(primeiro == null){
            return 0;
        }

        No no = primeiro;
        int tamanho = 1;

        while (no.getProximo() != null) {
            tamanho++;
            no = no.getProximo();
        }

        return tamanho;

        
    }

}
