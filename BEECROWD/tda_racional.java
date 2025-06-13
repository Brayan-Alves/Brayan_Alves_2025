package BEECROWD;

import java.util.*;

public class tda_racional {
    public static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int x = LER.nextInt();

        LER.nextLine();
        for (int i = 0; i < x; i++) {
            String linha = LER.nextLine();
            String[] opCompleta = linha.split(" ");
            String operacao = opCompleta[3];
            String[] numA = {opCompleta[0], opCompleta[2]};
            String[] numB = {opCompleta[4], opCompleta[6]};
            int[] resp = new int[2];

            if(operacao.equals("+")){
                resp[1] = Integer.parseInt(numA[1]) * Integer.parseInt(numB[1]);
                resp[0] = ((resp[1] / Integer.parseInt(numA[1])) * Integer.parseInt(numA[0])) + (resp[1] / Integer.parseInt(numB[1])) * Integer.parseInt(numB[0]);
                System.out.print(resp[0]+"/"+resp[1] + " = ");
                simplificar(resp);
                System.out.println(resp[0]+"/"+resp[1]);
            }else if(operacao.equals("-")){
                resp[1] = Integer.parseInt(numA[1]) * Integer.parseInt(numB[1]);
                resp[0] = ((resp[1] / Integer.parseInt(numA[1])) * Integer.parseInt(numA[0])) - (resp[1] / Integer.parseInt(numB[1])) * Integer.parseInt(numB[0]);
                System.out.print(resp[0]+"/"+resp[1] + " = ");
                simplificar(resp);
                System.out.println(resp[0]+"/"+resp[1]);
            }else if(operacao.equals("*")){
                resp[0] = Integer.parseInt(numA[0]) * Integer.parseInt(numB[0]);
                resp[1] = Integer.parseInt(numA[1]) * Integer.parseInt(numB[1]);
                System.out.print(resp[0]+"/"+resp[1] + " = ");
                simplificar(resp);
                System.out.println(resp[0]+"/"+resp[1]);
            }else{
                resp[0] = Integer.parseInt(numA[0]) * Integer.parseInt(numB[1]);
                resp[1] = Integer.parseInt(numA[1]) * Integer.parseInt(numB[0]);
                System.out.print(resp[0]+"/"+resp[1] + " = ");
                simplificar(resp);
                System.out.println(resp[0]+"/"+resp[1]);
            }

        }



    }

    public static void simplificar(int[] vet){
        int x = 2;
        while (true) {
            if(vet[0] % x == 0 && vet[1] % x == 0){
                vet[0] /= x;
                vet[1] /= x;
            }else{
                x++;
            }
            if(x > Math.min(vet[0], vet[1])){
                break;
            }
        }
    }
}
