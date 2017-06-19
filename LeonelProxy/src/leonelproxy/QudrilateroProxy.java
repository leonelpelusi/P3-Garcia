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
public class QudrilateroProxy {

    public QudrilateroProxy(int lado1, int lado2) {
        Quadrilatero q;        
        q = lado1 > 0 && lado2 > 0 ? lado1 == lado2 ? new Quadrado(lado1) : new Retangulo(lado1, lado2) : null;
      
        if (q == null){
            System.out.println("Figura Inexistente!");
        }              
        
    } 
}