public class Cachorro extends Animal {
    private boolean canRun;

    public Cachorro(String nome, int idade, boolean canRun) {
        super(nome, idade);
        this.canRun = canRun;
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au au");
    }
}
