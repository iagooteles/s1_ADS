public abstract class Ingresso {
    protected String nome;
    protected boolean ehMeia;
    protected double preco;
    protected int lote;

    public Ingresso(String nome, boolean ehMeia, double preco, int lote) {
        this.nome = nome;
        this.ehMeia = ehMeia;
        this.preco = preco;
        this.lote = lote;
    }

    public abstract double calculaReembolso();
}
