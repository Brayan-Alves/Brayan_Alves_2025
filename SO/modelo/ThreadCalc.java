package SO.modelo;

public class ThreadCalc implements Runnable{

    private int tId;
    private double[] vet;
    private int pedaco;
    private int extra;
    private int inicio;
    private int fim;
                                                   
    public ThreadCalc(int id, double[] vetEntrada, int cpu_threads){
        inicio = 0;
        tId = id;
        fim = vetEntrada.length-1;
        vet = vetEntrada;

        pedaco = (int) Math.floor(vetEntrada.length/ cpu_threads);
        extra = vetEntrada.length % cpu_threads;
        if(tId < extra){
            inicio = tId * (pedaco+1);
            fim = inicio + pedaco;
        }else{
            inicio = extra*(pedaco+1) + (tId-extra) * pedaco;
            fim = inicio + pedaco - 1;
        }

        System.out.printf("T%d[%d,%d]\n", tId, inicio, fim);

    }

    @Override
    public void run(){
        for (int i = inicio; i <= fim; i++) {
            vet[i] = tId;
        }
    }
}