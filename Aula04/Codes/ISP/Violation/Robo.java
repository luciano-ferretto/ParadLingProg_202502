package ISP.Violation;

public class Robo implements Trabalhador {
    @Override
    public void trabalhar() {
        System.out.println("Robo executando tarefas automatizadas.");
    }

    @Override
    public void comer() {
        throw new UnsupportedOperationException("Robôs não come.");
    }
    
}
