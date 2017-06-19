package visitorleonel;

import java.util.ArrayList;

/**
 *
 * @author Leonel
 */
public class CalcStructure {

    ArrayList<DoisArgs> contas2 = new ArrayList<>();
    ArrayList<TresArgs> contas3 = new ArrayList<>();
    
    public void adicionar2(DoisArgs v){
        contas2.add(v);
    }
    
    public void adicionar3(TresArgs v){
        contas3.add(v);
    }
    
    public void calcular(){
        SomaVisitor sv = new SomaVisitor();
        for(DoisArgs c : contas2){
            sv.somar(c);
        }
        for(TresArgs c : contas3){
            sv.somar(c);
        }
    }
}
