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
public class Retangulo implements Quadrilatero {

    private int lado1, lado2;

    public Retangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        calcularArea();
        calcularPerimetro();
    }
    

    @Override
    public void calcularArea() {
        System.out.println("Área do Retângulo: "+  this.lado1 * this.lado2);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Perímetro do Retângulo: "+  (2 * this.lado1) + (2 * this.lado2));
    }
    
}
