import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numerosInteiros = new ArrayList<>();

        numerosInteiros.add(1);
        numerosInteiros.add(2);
        numerosInteiros.add(3);
        numerosInteiros.add(4);
        numerosInteiros.add(5);
        numerosInteiros.add(6);

        System.out.println("Size: " + numerosInteiros.size());
        
        System.out.println("Adicionando 10 a todos os numeros(sem salvar no arraylist): ");
        for (var num: numerosInteiros) {
            System.out.println(num + 10);
        }

        System.out.println("Removendo o 2º elemento");
        numerosInteiros.remove(1);
        
        for (var num: numerosInteiros) {
            System.out.println(num);
        }

        System.out.println("Pegando o 3º elemento: " + numerosInteiros.get(2));

    }
}
