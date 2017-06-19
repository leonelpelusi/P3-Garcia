package visitorleonel;

/**
 *
 * @author Leonel
 */
public class DoisArgs implements NumeroElement{
    
    private int valor1, valor2;

    public DoisArgs(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    @Override
    public void accept(NumeroElement n) {
        n.accept(n);
    }
    
    public int getValor1() {
        return valor1;
    }

    public int getValor2() {
        return valor2;
    }

    
    
}
