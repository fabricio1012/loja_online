import java.util.HashMap;
import java.util.Map;

public class Carrinho {
    private Map<Integer, ItemCarrinho> produtos;

    public Carrinho() {
        produtos = new HashMap<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        if (produtos.containsKey(produto.getId())) {
            produtos.get(produto.getId()).adicionarQuantidade(quantidade);
        } else {
            produtos.put(produto.getId(), new ItemCarrinho(produto, quantidade));
        }
    }

    public void removerProduto(int produtoId) {
        produtos.remove(produtoId);
    }

    public void atualizarQuantidade(int produtoId, int quantidade) {
        if (produtos.containsKey(produtoId)) {
            if (quantidade <= 0) {
                removerProduto(produtoId);
            } else {
                produtos.get(produtoId).setQuantidade(quantidade);
            }
        }
    }

    public double calcularTotal() {
        return produtos.values().stream()
                .mapToDouble(ItemCarrinho::calcularPrecoTotal)
                .sum();
    }

    public Map<String, ItemCarrinho> listarProdutos() {
        Map<String, ItemCarrinho> lista = new HashMap<>();
        for (ItemCarrinho item : produtos.values()) {
            lista.put(item.getProduto().getNome(), item);
        }
        return lista;
    }
}
