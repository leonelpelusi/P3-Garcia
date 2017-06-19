package corleonel;

/**
 *
 * @author Leonel
 */
public class SuperiorTribunal extends SistemaJudiciario {
    
    private String nome; 
    
    public SuperiorTribunal() {
        this.nome = "Superior Tribunal";
    }

    @Override
    public void julgar(Processo processo) {
        if(processo.getInstancia() == 3 ) {
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
