public class Cliente {
    private String nome;
    private String cpf;
    private double dinheiro;

    public Cliente(String cpf, double dinheiro, String nome) {
        this.cpf = cpf;
        this.dinheiro = dinheiro;
        this.nome = nome;
    }

    public String comprarComida(double valorComida) {
        if (valorComida > this.dinheiro) {
            return "Dinheiro insuficiente.";
        }
        this.dinheiro -= valorComida;
        return "Comida comprada";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
    
}