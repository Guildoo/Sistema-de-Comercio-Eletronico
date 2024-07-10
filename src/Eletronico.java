public class Eletronico extends Produto {

    private String marca;
    private String modelo;

    public Eletronico(String nome, Double preco, int quantidadeEmEstoque, String marca, String modelo) {
        super(nome, preco, quantidadeEmEstoque);
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public double calcularDesconto() {
        return getPreco() * 0.9; //Desconto específico para Eletronicos
    }

    //Getter and Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
