package corleonel;

/**
 *
 * @author Leonel
 */
public class SupremoTribunalFederal extends SistemaJudiciario {
    
    private String nome; 
    
    public SupremoTribunalFederal() {
        this.nome = "Supremo Tribunal Federal";
    }

    @Override
    public void julgar(Processo processo) {
        if(processo.getInstancia() == 4 ) {
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
