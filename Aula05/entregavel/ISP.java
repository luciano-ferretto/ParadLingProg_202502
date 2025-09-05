public class ISP {
    public static void main(String[] args) {
        // Criando instâncias de Canarinho e Pinguim
        Ave canarinho = new Canarinho();
        Ave pinguim = new Pinguim();

        // Chamando os métodos
        canarinho.comer();
        voar(canarinho);

        pinguim.comer();
        voar(pinguim);
    }
    private static void voar(Ave ave) {
        ave.voar();
        
    }
}

interface Ave {
    void comer();
    void voar();
}
class Canarinho implements Ave {
    @Override
    public void comer() {
        System.out.println("Canarinho comendo");
    }
    @Override
    public void voar() {
        System.out.println("Canarinho voando");
    }
}
class Pinguim implements Ave {
    @Override
    public void comer() {
        System.out.println("Pinguim comendo");
    }
    @Override
    public void voar() {
        throw new UnsupportedOperationException("Pinguim não voa");
    }
}




