public class Carrinho {
    private Produto[] produtos;
    private int limiteProdutos;

    public Carrinho(int qntdProdutos) {
        this.produtos = new Produto[qntdProdutos];
        this.limiteProdutos = qntdProdutos;
    }

    public Produto[] getProdutos() {
        return this.produtos;
    }

    // public Produto[] pesoMaiorQue10ValorMenorQue50() {

    // }

    public void addProduto(Produto produto) {
        if (this.isCarrinhoFull()) {
            System.out.println("Carrinho já está cheio.");
        } else {
            for (int i = 0; i < produtos.length; i++) {
                produtos[i] = produto;

            }
        }
    }

    public boolean isCarrinhoVazio() {
        return this.produtos.length == 0;
    }

    public boolean isCarrinhoFull() {
        return this.produtos[limiteProdutos - 1] != null;
    }

    public void mostrarInfoCarrinho() {
        for (int i = 0; i < limiteProdutos; i++) {
            if (this.produtos[i] != null) {
                this.produtos[i].showProdutoInfo();
            }
        }
    }
}
