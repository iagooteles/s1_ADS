import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Preguica p1 = new Preguica("Preguiçoso", 5, true);
        Cachorro c1 = new Cachorro("Doguinho", 12, false);

        p1.emitirSom();
        c1.emitirSom();

        Animal a1 = new Cachorro("Cachorro", 8, true);
        a1.emitirSom();

        ArrayList<Animal> animais = new ArrayList();
        animais.add(a1);
        animais.add(p1);
        animais.add(c1);

        int idade = 0;
        for (Animal animal : animais) {
            idade += animal.getIdade();
        }

        int media = idade / animais.size();
        System.out.println("A média de idade dos animais é: " + media);
    }
}
