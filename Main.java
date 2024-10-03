public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Camiseta", 29.90);
        Produto p2 = new Produto(2, "Calça", 79.90);

        Cliente mateus = new Cliente("Mateus");
        mateus.adicionarAoCarrinho(p1, 2); // Adiciona 2 camisetas
        mateus.adicionarAoCarrinho(p2, 1); // Adiciona 1 calça

        mateus.visualizarCarrinho();

        mateus.atualizarQuantidadeCarrinho(1, 1); // Atualiza a quantidade da camiseta para 1
        System.out.println("\nApós atualizar a quantidade:");
        mateus.visualizarCarrinho();

        mateus.removerDoCarrinho(2); // Remove a calça
        System.out.println("\nApós remover a calça:");
        mateus.visualizarCarrinho();
    }
}
