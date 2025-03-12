class Pessoa {
    public String nome;
    public int anoNascimento;
    public double peso;
    public double altura;
    
    public Pessoa() {
    }

    public Pessoa(String nome, int anoNascimento, double peso, double altura) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        return (this.peso / (this.altura * this.altura));
    }

    public int calcularIdade() {
        return (2025 - this.anoNascimento);
    }

    public double calcularQntAguaPorDia() {
        return (this.peso * 0.035);
    }

    public void mostra() {
        System.out.println(this.nome);
        System.out.println("Tem que beber " + String.format("%.2f", this.calcularQntAguaPorDia())  + "l água por dia");
        System.out.println("Tem " + this.calcularIdade() + " anos.");
        System.out.println("Tem o IMC de " + String.format("%.2f", this.calcularIMC()));
    }
}