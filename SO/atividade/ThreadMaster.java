package SO.atividade;

import SO.modelo.ThreadCalc;

public class ThreadMaster{
    public void letsDoSomeCalc(){
        double[] vet = new double[12];
        int cpu_threads = 3;

        Thread[] vet_threads = new Thread[cpu_threads];

        for (int i = 0; i < cpu_threads; i++) {
            vet_threads[i] = new Thread(new ThreadCalc(i, vet, cpu_threads));
            vet_threads[i].start();
        }

        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
    }
}