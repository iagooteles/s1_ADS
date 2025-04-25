import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Academia academia = new Academia();

        Cliente c1 = new Cliente(1, "c1",2001, "1");
        Cliente c2 = new Cliente(2, "c2",2000, "1");
        Cliente c3 = new Cliente(3, "c3",2010, "1");
        Cliente c4 = new Cliente(4, "c4",1980, "1");
        Cliente c5 = new Cliente(5, "c5",1950, "1");
        Cliente c6 = new Cliente(6, "c6",2005, "1");
        Cliente c7 = new Cliente(7, "c7",1970, "1");

        academia.cadastrarCliente(c1);
        academia.cadastrarCliente(c2);
        academia.cadastrarCliente(c3);
        academia.cadastrarCliente(c4);
        academia.cadastrarCliente(c5);
        academia.cadastrarCliente(c6);
        academia.cadastrarCliente(c7);

        academia.clientesDps2000();

        academia.listarInfoPorID(4);
        System.out.println("Removendo cliente 4");
        academia.removerCliente(4);



    }
}
