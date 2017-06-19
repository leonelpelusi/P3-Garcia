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
public abstract class Conta {    
    InvestimentoStrategy is;

    public Conta(InvestimentoStrategy is) {
        this.is = is;
    }

    public double calcInvestimento(double valor) {
        return (is.calcInv() * valor * is.getImposto()) + valor ;
    }
}
