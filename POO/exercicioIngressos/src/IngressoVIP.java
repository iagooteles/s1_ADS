public class IngressoVIP extends Ingresso {
    public IngressoVIP(String nome, boolean ehMeia, double preco, int lote) {
        super(nome, ehMeia, preco, lote);
    }

    @Override
    public double calculaReembolso() {
        if (!this.ehMeia && this.lote == 1) {
            return 0.1 * this.preco;
        }
        return 0.06 * this.preco;
    }
}
