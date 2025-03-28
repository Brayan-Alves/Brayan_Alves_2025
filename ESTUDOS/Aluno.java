public class Aluno {
    
    //atributos
    String nome;
    String curso;
    int idade;

    //métodos
    void presenca(char x){
        if(x == 'P'){
            System.out.println("Presente");
        }else{
            System.out.println("Faltou");
        }
    }

    void calcularMedia(float a, float b, float c){
        System.out.println("Média: " + (a + b + c) / (float)3);
    }

    void passouDeAno(boolean r){
        if(r){
            System.out.println(nome + " passou de Ano!!!");
        }else{
            System.out.println(nome + " reprovou!!!");
        }
        
    }
}
    
    

