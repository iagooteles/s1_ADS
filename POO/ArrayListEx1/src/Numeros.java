import java.util.ArrayList;

public class Numeros {
    private ArrayList<Integer> numeros;
    
    public Numeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionar(int num) {
        this.numeros.add(num);
    }

    public void remover(int index) {
        this.numeros.remove(index);
    }

    public void buscar(int num) {
        for (int numero: numeros) {
            if (num == numero) {
                System.out.println("Numero encontrado! " + numero + "\nNo index: " + numeros.indexOf(numero) );
            }
        }
    }

    public void modificar(int index, int newNum) {
        numeros.set(index, newNum);
    }

    public void mostrar() {
        for(int numero: numeros) {
            System.out.print(numero + " - ");
        }
        System.out.println("");
    }

}
