import java.util.ArrayList;

public class Academia {
    private ArrayList<Cliente> clientes;

    public Academia() {
        clientes = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() {
        return this.clientes;
    }

    public void cadastrarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void removerCliente(int id) {
        this.clientes.remove(id);
    }

    public void quantidadeClientes() {
        System.out.println("Quantidade de clientes: " + this.clientes.size());
    }

    public void clientesDps2000() {
        for (var cliente: clientes) {
            if (cliente.getAnoNasc() > 2000) {
                System.out.println(cliente.getNome() + " nasceu depois dos anos 2000.");
            }
        }
    }
    
    public void removerClientesAntes1990() {
        for (var cliente: clientes) {
            if (cliente.getAnoNasc() < 1990) {
                clientes.remove(cliente.getId());
            }
        }
    }

    public void listarInfoPorID(int id) {
        Cliente cliente = clientes.get(id);
        System.out.println("ID: " + cliente.getId());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Ano de nascimento: " + cliente.getAnoNasc());
        System.out.println("Telefone: " + cliente.getTelefone());
    }
}
