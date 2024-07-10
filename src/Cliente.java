public class Cliente extends Usuario {
    private String endereco;
    public Cliente(String nome, String email, String endereco) {
        super(nome, email);
        this.endereco;
    }

    //Getter and Setter

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String tipoDeUsuario() {
        return "Cliente";
    }
}
