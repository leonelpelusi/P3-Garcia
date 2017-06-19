package visitorleonel;

/**
 *
 * @author Leonel
 */
public class SomaVisitor implements OperVisitor{

    @Override
    public void somar(DoisArgs d) {
        System.out.println("Resultado de dois números: " + (d.getValor1() + d.getValor2()));        
    }

    @Override
    public void somar(TresArgs t) {
        System.out.println("Resultado de três números: " + (t.getValor1() + t.getValor2() + t.getValor3()));        
    } 
    
   
}
