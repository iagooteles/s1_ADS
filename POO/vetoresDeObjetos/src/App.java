public class App {
    public static void main(String[] args) throws Exception {
        Produto p1 = new Produto("123", 50.0, 25.0);
        Produto p2 = new Produto("111", 40.0, 35.0);
        Produto p3 = new Produto("223", 30.0, 45.0);
        Produto p4 = new Produto("435", 20.0, 55.0);
        Produto p5 = new Produto("777", 10.0, 65.0);
        Produto p6 = new Produto("887", 5.0, 95.0);

        Carrinho carrinho = new Carrinho(5);

        carrinho.addProduto(p1);
        carrinho.addProduto(p2);
        carrinho.addProduto(p3);

        carrinho.mostrarInfoCarrinho();

    }
}
