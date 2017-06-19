/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyleonel;

/**
 *
 * @author Leonel
 */
public class StrategyLeonel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Fundos conta1 = new Fundos(Rendimento.RENDAFIXA);
        
        System.out.println(conta1.calcInvestimento(50000));
        
    }
    
}
