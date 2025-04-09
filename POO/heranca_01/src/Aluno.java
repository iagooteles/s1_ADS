public class Aluno extends Pessoa {
    public int matricula;

    public Aluno(String cpf, String rg, String nome, int matricula) {
        super(cpf, rg, nome);
        this.matricula = matricula;
    }

    public void estudar() {
        System.out.println("Estudando....");
    }

    public void mostrarAluno() {
        super.mostrar();
        System.out.println("Matricula: " + this.matricula);
    }
    
}
