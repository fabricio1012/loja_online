public class Cliente {
    private String nome;
    private Carrinho carrinho;

    public Cliente(String nome) {
        this.nome = nome;
        this.carrinho = new Carrinho();
    }

    public void adicionarAoCarrinho(Produto produto, int quantidade) {
        carrinho.adicionarProduto(produto, quantidade);
    }

    public void removerDoCarrinho(int produtoId) {
        carrinho.removerProduto(produtoId);
    }

    public void atualizarQuantidadeCarrinho(int produtoId, int quantidade) {
        carrinho.atualizarQuantidade(produtoId, quantidade);
    }

    public void visualizarCarrinho() {
        System.out.println("Produtos no carrinho:");
        for (ItemCarrinho item : carrinho.listarProdutos().values()) {
            System.out.println(item);
        }
        System.out.println("Total a pagar: R$" + String.format("%.2f", carrinho.calcularTotal()));
    }
}
