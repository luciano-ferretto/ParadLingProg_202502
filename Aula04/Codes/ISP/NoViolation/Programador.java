package ISP.NoViolation;

public class Programador implements Trabalhavel, Alimentavel {
    @Override
    public void trabalhar() {
        System.out.println("Programador escrevendo código.");
    }

    @Override
    public void comer() {
        System.out.println("Programador também se alimenta.");
    }
    
}
