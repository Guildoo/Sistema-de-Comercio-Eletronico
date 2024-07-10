public class Administrador extends Usuario{
    public Administrador(String nome, String email) {
        super(nome, email);
    }


    @Override
    public String tipoDeUsuario() {
        return "Administrador"; // tipo de usuario
    }
}

