public class Funcionario extends Pessoa {
    public String setor;
    public int matricula;

    public Funcionario(String cpf, String rg, String nome, String setor, int matricula) {
        super(cpf, rg, nome);
        this.setor = setor;
        this.matricula = matricula;
    }

    public void receberSalario() {
        System.out.println(this.getNome() + " recebeu seu salário.....");
    }    
}
