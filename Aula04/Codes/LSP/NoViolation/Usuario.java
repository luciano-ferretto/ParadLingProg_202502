package LSP.NoViolation;

public class Usuario implements Autenticavel {
    protected String nome;
    public Usuario(String nome) {
        this.nome = nome;
    }

    public void acessarSistema() {
        System.out.println(nome + " acessou o sistema.");
    }
    
}
