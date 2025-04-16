public class App {
    public static void main(String[] args) throws Exception {
        Zoologico zoo = new Zoologico();
        Gato gato1 = new Gato("gatito", 12);
        Gato gato2 = new Gato("mooncake", 14);
        Cachorro cachorro1 = new Cachorro("Bilas", 1);
        Cachorro cachorro2 = new Cachorro("Pandora", 9);
        Leao leao1 = new Leao("Cat", 10);

        zoo.adicionarAnimal(gato1);
        zoo.adicionarAnimal(gato2);
        zoo.adicionarAnimal(cachorro1);
        zoo.adicionarAnimal(cachorro2);
        zoo.adicionarAnimal(leao1);

        zoo.listarAnimais();
        System.out.println("_".repeat(30));
        zoo.emitirSons();

    }
}
