
public class testeObjeto {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno();
        
        aluno1.nome = "Brayan";
        aluno1.curso = "Técnico em Informática";
        aluno1.idade = 16;

        aluno1.presenca('P');
        aluno1.calcularMedia(100, 90, 60);
        aluno1.passouDeAno(true);

    }
}
