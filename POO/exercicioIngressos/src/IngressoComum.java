public class IngressoComum extends Ingresso {
    public IngressoComum(String nome, boolean ehMeia, double preco, int lote) {
        super(nome, ehMeia, preco, lote);
    }

    @Override
    public double calculaReembolso() {
        if (!this.ehMeia || this.lote == 1) {
            return this.preco * 0.05;
        }
        return this.preco * 0.03;
    }
}
