package ISP.Violation;

public class Programador implements Trabalhador {
    @Override
    public void trabalhar() {
        System.out.println("Programador escrevendo código.");
    }

    @Override
    public void comer() {
        System.out.println("Programador também se alimenta.");
    }
    
}
