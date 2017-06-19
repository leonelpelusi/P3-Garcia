package visitorleonel;

/**
 *
 * @author Leonel
 */
public class TresArgs implements NumeroElement{
    
    private int valor1, valor2, valor3;

    public TresArgs(int valor1, int valor2, int valor3) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
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

    public int getValor3() {
        return valor3;
    }   
    
}
