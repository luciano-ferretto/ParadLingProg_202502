package LSP.Violation;

public class Usuario {
    protected String nome;
    public Usuario(String nome) {
        this.nome = nome;
    }

    public void acessarSistema() {
        System.out.println(nome + " acessou o sistema.");
    }
}
