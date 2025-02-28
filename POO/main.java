
public class main {
    public static void main(String[] args) {
        Cliente iago = new Cliente("05125100517", 100, "Iago Teles");

        String cpfCliente = iago.getCpf();
        String nomeCliente = iago.getNome();

        System.out.println("Nome: " + nomeCliente);
        System.out.println("CPF: " + cpfCliente);
        System.out.println(iago.comprarComida(150));
    }
}
