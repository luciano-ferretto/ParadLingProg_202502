package LSP.Violation;

public class ControleAcesso {
    public static void acessarSistema(Usuario usuario) {
        usuario.acessarSistema();
    }
    public static void main(String[] args) {
        Usuario user = new Usuario("Maria");
        acessarSistema(user);
        
        Usuario guest = new UsuarioConvidado("João");
        acessarSistema(guest);
    }
}
