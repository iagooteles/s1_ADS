public class Animal implements Som {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirDados() {
        System.out.println("nome: " + this.nome + " | " + "idade: " + this.idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O animal fez algum barulho");
    }
}
