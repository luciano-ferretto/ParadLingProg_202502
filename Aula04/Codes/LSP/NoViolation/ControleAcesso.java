package LSP.NoViolation;

public class ControleAcesso {
    public static void acessarSistema(Autenticavel usuario) {
        usuario.acessarSistema();
    }
    public static void main(String[] args) {
        Usuario user = new Usuario("Maria");
        acessarSistema(user);
        
        UsuarioConvidado guest = new UsuarioConvidado("João");
        acessarSistema(guest);
    }
}
