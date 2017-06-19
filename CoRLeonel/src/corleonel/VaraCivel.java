package corleonel;

/**
 *
 * @author Leonel
 */
public class VaraCivel extends SistemaJudiciario {
    
    private String nome; 
    
    public VaraCivel() {
        this.nome = "1ª Vara Cível";
    }

    @Override
    public void julgar(Processo processo) {
        if(processo.getInstancia() == 1) {
            if(irArbitragem()){
                System.out.println("O processo nº"+ processo.getNumeroProc()+" foi para a arbitragem!");
            } else {
                System.out.println("O processo nº"+ processo.getNumeroProc()+" foi julgado pela " + this.nome);
            } 
        } else {
            this.proximo.julgar(processo);
        }
    }
    
}
