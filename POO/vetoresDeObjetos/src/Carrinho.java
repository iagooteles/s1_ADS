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

    public int totalCarrinho() {
        int retorno = 0;

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null) {
                retorno++;
            }
        }

        return retorno;
    }

    public void addProduto(Produto produto) {
        if (this.isCarrinhoFull()) {
            System.out.println("Carrinho já está cheio.");
        } else {
            for (int i = 0; i < this.totalCarrinho(); i++) {
                System.out.println("aqui");
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
        for (int i = 0; i < this.totalCarrinho(); i++) {
            this.produtos[i].showProdutoInfo();
        }
    }
}
