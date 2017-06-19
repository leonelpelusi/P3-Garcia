package visitorleonel;

/**
 *
 * @author Leonel
 */
public class Teste {

    public static void main(String[] args) {
        DoisArgs d = new DoisArgs(1,2);
        TresArgs t = new TresArgs(1,2,3);
        
        CalcStructure cs = new CalcStructure();
        
        cs.adicionar2(d);
        cs.adicionar3(t);
        
        cs.calcular();
    }
    
}
