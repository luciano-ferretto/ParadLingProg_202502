package LSP.Violation;

public class UsuarioConvidado  extends Usuario {
    public UsuarioConvidado(String nome) {
        super(nome);
    }

    @Override
    public void acessarSistema() {
        throw new UnsupportedOperationException("Convidados não têm acesso ao sistema.");
    }
    
}
