package corleonel;

/**
 *
 * @author Leonel
 */
public abstract class SistemaJudiciario {
    
    SistemaJudiciario proximo;

    public abstract void julgar(Processo p);

    public boolean irArbitragem(){
        return Math.random() > 0.5;
    }
    
    public void setProximo(SistemaJudiciario proximo) {
        this.proximo = proximo;
    }
    
}
