public class Preguica extends Animal {
    private boolean podeEscalar;

    public Preguica(String nome, int idade, boolean podeEscalar) {
        super(nome, idade);
        this.podeEscalar = podeEscalar;
    }

    @Override
    public void emitirSom() {
        System.out.println("Que preguiça de fazer som.");
    }
}
