class Pessoa {
    private String cpf;
    private String rg;
    private String nome;

    public Pessoa(String cpf, String rg, String nome) {
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
    }

    public void andar() {
        System.out.println("Andou");
    }

    public void mostrar() {
        System.out.println("CPF: " + this.cpf);
        System.out.println("RG:" + this.rg);
        System.out.println("Nome: " + this.nome);
    }

    public String getNome() {
        return this.nome;
    }
}