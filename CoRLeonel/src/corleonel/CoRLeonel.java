package corleonel;

/**
 *
 * @author Leonel
 */
public class CoRLeonel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Processo p1 = new Processo("Descrição1",1,4);
        Processo p2 = new Processo("Descrição2",2,3);
        Processo p3 = new Processo("Descrição3",3,2);
        Processo p4 = new Processo("Descrição4",4,1);
        
        VaraCivel VC1 = new VaraCivel();
        SuperiorTribunal ST = new SuperiorTribunal();
        TribunalDeJustica TF = new TribunalDeJustica();
        SupremoTribunalFederal STF = new SupremoTribunalFederal();
        
        VC1.setProximo(ST);
        ST.setProximo(TF);
        TF.setProximo(STF);
        
        VC1.julgar(p1);
        VC1.julgar(p2);
        VC1.julgar(p3);
        VC1.julgar(p4);
    }
    
}
