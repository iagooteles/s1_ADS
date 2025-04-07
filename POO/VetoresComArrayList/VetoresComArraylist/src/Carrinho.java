
import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    public Produto getProdutoPorIndex(int index) {
        return this.produtos.get(index);
    }

    public int totalCarrinho() {
        int retorno = 0;

        for (Produto produto: produtos) {
            if (produto != null) {
                retorno++;
            }
        }

        return retorno;
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public boolean isCarrinhoVazio() {
        for (Produto produto : produtos) {
            if (produto != null) {
                return false;
            }
        }
        return true;
    }

    public void mostrarInfoCarrinho() {
        for (Produto produto : produtos) {
            if (produto != null) {
                produto.showProdutoInfo();
            }
        }
    }
}
