package corleonel;

/**
 *
 * @author Leonel
 */
public class TribunalDeJustica extends SistemaJudiciario {
    
    private String nome; 
    
    public TribunalDeJustica() {
        this.nome = "Tribunal de Justiça";
    }

    @Override
    public void julgar(Processo processo) {
        if(processo.getInstancia() == 2) {
            if(irArbitragem()){
                System.out.println("O processo nº"+ processo.getNumeroProc()+" foi para a arbitragem!");
            } else {
                System.out.println("O processo nº"+ processo.getNumeroProc()+" foi julgado pelo " + this.nome);
            }
        } else {
            this.proximo.julgar(processo);
        }
    }
    
}
