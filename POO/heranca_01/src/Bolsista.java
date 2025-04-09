public class Bolsista extends Aluno {
    private boolean isAtleta;

    public Bolsista(String cpf, String rg, String nome, int matricula, boolean isAtleta) {
        super(cpf, rg, nome, matricula);
        this.isAtleta = isAtleta;
    }

    public void trabalhar() {
        System.out.println(this.getNome() + " trabalhou...");
    }
    
}
