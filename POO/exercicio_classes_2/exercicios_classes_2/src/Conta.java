

public class Conta {
    private String cpf;
    private String numeroBanco;
    private double saldo;
    private boolean clienteEspecial;

    public Conta(String cpf, String numeroBanco, double saldo, boolean clienteEspecial) {
        this.cpf = cpf;
        this.numeroBanco = numeroBanco;
        this.saldo = saldo;
        this.clienteEspecial = clienteEspecial;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setNumero(String numeroBanco) {
        this.numeroBanco = numeroBanco;
    }

    public String getNumeroBanco() {
        return this.numeroBanco;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setClienteEspecial(Boolean clienteEspecial) {
        this.clienteEspecial = clienteEspecial;
    }

    public boolean getClienteEspecial() {
        return this.clienteEspecial;
    }

    public double getBonificacao() {
        if (this.clienteEspecial) {
            return this.saldo * 1.1;
        }
        return this.saldo * 1.05;
    }

    public boolean realizarSaque(double valor) {
        if (valor > this.saldo) {
            System.out.println("Não há saldo suficiente.");
            return false;
        } 

        System.out.println("Você sacou R$" + valor + ".");

        this.saldo -= valor;
        
        return true;
    }
    
    public void realizarDeposito(double valor) {
        System.out.println("Você realizou deposito de R$" + valor + ".");

        this.saldo += valor;
    }

    public boolean realizarTransferencia(Conta conta, double valor) {
        if (valor > this.saldo) {
            System.out.println("Não há saldo suficiente.");
            return false;
        }
        
        this.realizarSaque(valor);
        System.out.println("Transferência realizada com sucesso!.");

        conta.realizarDeposito(valor);

        return true;
    }
}
