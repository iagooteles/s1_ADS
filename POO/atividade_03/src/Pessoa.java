public class Pessoa {
    private String nome;
    private String cpf;
    private int anoNascimento;
    private double altura;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAnoNascimento() {
        return this.anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int calcularIdade() {
        return (2025 - this.anoNascimento);
    }

    public void mostrarDados() {
        System.out.println("nome: " + this.nome);
        System.out.println("cpf: " + this.cpf);
        System.out.println("ano de nascimento: " + this.anoNascimento);
        System.out.println("altura: " + this.altura);
    }
}