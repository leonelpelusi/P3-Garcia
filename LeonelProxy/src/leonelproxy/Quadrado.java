/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leonelproxy;

/**
 *
 * @author Leonel
 */
public class Quadrado implements Quadrilatero{

    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
        calcularArea();
        calcularPerimetro();
    }
    
    @Override
    public void calcularArea() {
        System.out.println("Area do Quadrado: " + this.lado * this.lado);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Perímetro do Quadrado: "+ this.lado * 4); 
    }
    
}
