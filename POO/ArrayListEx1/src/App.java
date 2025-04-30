import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        /// Código do primeiro exercício arraylist de numeros ///
        // Numeros numeros = new Numeros();
        // numeros.adicionar(1);
        // numeros.adicionar(2);
        // numeros.adicionar(3);
        // numeros.adicionar(4);
        // numeros.adicionar(5);
        // numeros.adicionar(6);

        // System.out.println("Mostrando todos os numeros: ");
        // numeros.mostrar();

        // System.out.println("Buscando numero 5");
        // numeros.buscar(5);

        // System.out.println("Removendo um numero por index(index: 2 --- elemento 3).");
        // numeros.remover(2);
        
        // System.out.println("Mostrando todos os numeros novamente sem o numero removido: ");
        // numeros.mostrar();

        // System.out.println("Modificando o primeiro elemento por 20 e depois buscando o numero 20.");
        // numeros.modificar(0, 20);
        // numeros.buscar(20);


        /////// Código do exercício da academia ////
        Academia academia = new Academia();

        Cliente c1 = new Cliente(1, "Marcelo",2001, "1");
        Cliente c2 = new Cliente(2, "Jão",2000, "1");
        Cliente c3 = new Cliente(3, "Carla",2010, "1");
        Cliente c4 = new Cliente(4, "Jovem",1980, "1");
        Cliente c5 = new Cliente(5, "Padawan",1950, "1");
        Cliente c6 = new Cliente(6, "Griffin",2005, "1");
        Cliente c7 = new Cliente(7, "Mortis",1970, "1");

        academia.cadastrarCliente(c1);
        academia.cadastrarCliente(c2);
        academia.cadastrarCliente(c3);
        academia.cadastrarCliente(c4);
        academia.cadastrarCliente(c5);
        academia.cadastrarCliente(c6);
        academia.cadastrarCliente(c7);

        System.out.println("Listando todos os clientes: ");
        academia.listarTodosClientes();

        System.out.println("Numero de clientes cadastrados: ");
        academia.quantidadeClientes();

        System.out.println("Listando todos os clientes que nasceram depois de 2000: ");
        academia.clientesDps2000();

        System.out.println("Listando por id(4):");
        academia.listarInfoPorID(4);

        System.out.println("Removendo cliente de index 4");
        academia.removerClientePorID(4);

        System.out.println("Listando todos os clientes para mostrar que o cliente de index 4(O cliente de ID: 5) foi removido: ");
        academia.listarTodosClientes();

        System.out.println("Removendo todos os clientes que nasceram antes de 1990");
        academia.removerClientesAntes1990();
        academia.listarTodosClientes();
    }
}
