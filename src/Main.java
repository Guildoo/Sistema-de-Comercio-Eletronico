import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Criando Produtos
        Eletronico eletronico1 = new Eletronico("Iphone 13", 4999.00, 25, "Apple", "Iphone 13");
        Roupa roupa1 = new Roupa("Camiseta", 50.00, 20, "M", "Azul");

        // Descontos
        System.out.println("Desconto no eletrônico: " + eletronico1.calcularDesconto());
        System.out.println("Desconto na roupa: " + roupa1.calcularDesconto());

        Cliente cliente = new Cliente("João Silva", "joao@gmail.com", "Rua A, 123");

        // Lista de produtos para o pedido
        List<Produto> produtos = new ArrayList<>();
        produtos.add(eletronico1);
        produtos.add(roupa1);

        Pedido pedido = new Pedido(cliente, produtos, "Em processamento");

        Roupa roupa2 = new Roupa("Calça", 80.00, 15, "G", "Preta");
        pedido.adicionarProduto(roupa2);

        System.out.println("Total do pedido: " + pedido.calcularTotal());

        // Processando um pagamento
        Pagamento pagamento = new PagamentoCartao(pedido.calcularTotal(), "1234-5678-9876-5432");
        pagamento.processarPagamento();

        System.out.println("Tipo de usuário: " + cliente.tipoDeUsuario());
    }
}
