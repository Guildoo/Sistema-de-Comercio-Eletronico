public class Roupa extends Produto {
    private String tamanho;
    private String cor;

    public Roupa(String nome, Double preco, int quantidadeEmEstoque, String tamanho, String cor) {
        super(nome, preco, quantidadeEmEstoque);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    @Override
    public double calcularDesconto() {
        return getPreco() * 0.8; //Desconto específico para Roupas
    }

    //Getter and Setter
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
