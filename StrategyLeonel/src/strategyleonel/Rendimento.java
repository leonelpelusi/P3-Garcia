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
public enum Rendimento implements InvestimentoStrategy {
    
    FUNDOS(Math.random(),0.9), POUPANCA(0.005,1), RENDAFIXA(0.011,0.97);
    
    private double valor, imposto;

    private Rendimento(double valor, double imposto) {
        this.valor = valor;
        this.imposto = imposto;
    }    
    
    @Override
    public double calcInv() {
        return this.valor;
    }

    public double getImposto() {
        return imposto;
    }

    
    
    
}
