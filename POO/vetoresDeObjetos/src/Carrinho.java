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
            return;
        }

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] == null) {
                produtos[i] = produto;
                return;
            }
        }
    }

    public boolean isCarrinhoVazio() {
        for (Produto produto : produtos) {
            if (produto != null) {
                return false;
            }
        }
        return true;
    }

    public boolean isCarrinhoFull() {
        return this.totalCarrinho() == limiteProdutos;
    }

    public void mostrarInfoCarrinho() {
        for (Produto produto : produtos) {
            if (produto != null) {
                produto.showProdutoInfo();
            }
        }
    }
}
