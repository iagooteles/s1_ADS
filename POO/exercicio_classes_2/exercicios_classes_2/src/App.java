public class App {
    public static void main(String[] args) throws Exception {

        Conta contaIago = new Conta("12399573", "2323", 1500.00, false);

        String cpfConta = contaIago.getCpf();
        String numeroConta = contaIago.getNumeroBanco();
        double saldoConta = contaIago.getSaldo();
        boolean clienteEspecial = contaIago.getClienteEspecial();

        System.out.println("cpf: " + cpfConta);
        System.out.println("numeroConta: " + numeroConta);
        System.out.println("saldoConta: " + saldoConta);
        System.out.println("clienteEspecial: " + clienteEspecial);

        System.out.println("bonificação: " + String.format("%.2f", contaIago.getBonificacao()));

        contaIago.realizarSaque(1050);
        System.out.println("Depois do saque: " + contaIago.getSaldo());

        contaIago.realizarDeposito(11750.20);
        System.out.println("Depois do deposito: " + contaIago.getSaldo());

        Conta fulano = new Conta("9812749", "2525", 0, true);

        System.out.println("saldo antigo de fulano: " + fulano.getSaldo());
        System.out.println("saldo antigo de iago: " + contaIago.getSaldo());
        contaIago.realizarTransferencia(fulano, 5000);
        System.out.println("Novo saldo de fulano: " + fulano.getSaldo());
        System.out.println("Novo saldo de iago: " + String.format("%.2f", contaIago.getSaldo()));
    }
}
