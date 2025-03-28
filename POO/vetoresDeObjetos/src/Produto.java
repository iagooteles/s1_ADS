public class Produto {
    private String codigo;
    private double peso;
    private double valor;

    public Produto(String codigo, double peso, double valor) {
        this.codigo = codigo;
        this.peso = peso;
        this.valor = valor;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void showProdutoInfo() {
        System.out.println("_".repeat(30));
        System.out.println("Código do produto: " + this.codigo);
        System.out.println("Peso do produto: " + this.peso);
        System.out.println("valor do produto: " + this.valor);
        System.out.println("_".repeat(30));
    }
}