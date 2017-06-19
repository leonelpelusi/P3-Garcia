package corleonel;

/**
 *
 * @author Leonel
 */
public class Processo {

    private String descricao;
    private int numeroProc;
    private int instancia;

    public Processo(String descricao, int numeroProc, int instancia) {
        this.descricao = descricao;
        this.numeroProc = numeroProc;
        this.instancia = instancia;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getNumeroProc() {
        return numeroProc;
    }

    public int getInstancia() {
        return instancia;
    } 
    
}
