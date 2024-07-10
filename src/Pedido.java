import java.util.List;
public class Pedido {
    private Usuario usuario;
    private List<Produto> produtos;
    private String status;

    public Pedido(Usuario usuario, List<Produto> produtos, String status) {
        this.usuario = usuario;
        this.produtos = produtos;
        this.status = status;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }
}
