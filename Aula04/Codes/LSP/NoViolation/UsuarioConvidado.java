package LSP.NoViolation;

public class UsuarioConvidado {
    private String nome;
    public UsuarioConvidado(String nome) {
        this.nome = nome;
    }   
    public void visualizarConteudo() {
        System.out.println(nome + " está visualizando o conteúdo como convidado.");
    }
}
