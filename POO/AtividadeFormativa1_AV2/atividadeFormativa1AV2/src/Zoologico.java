
import java.util.ArrayList;

public class Zoologico {
    private ArrayList<Animal> animais = new ArrayList<>();


    public void adicionarAnimal(Animal animal) {
        this.animais.add(animal);
    }

    public void listarAnimais() {
        for (var animal: animais) {
            animal.emitirDados();
        }
    }

    public void emitirSons() {
        for (var animal: animais) {
            animal.emitirSom();
        }
    }

}
