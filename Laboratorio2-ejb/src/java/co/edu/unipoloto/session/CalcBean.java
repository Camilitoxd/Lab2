/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipoloto.session;

import javax.ejb.Stateless;

/**
 *
 * @author Camilo Gomez
 */
@Stateless
public class CalcBean implements CalcBeanLocal {

    @Override
    public Integer suma(int a, int b) {
        return a+b;
    }
        @Override
    public int resta(int a, int b) {
        return a-b;
    }
     @Override
    public double division(int a, int b) {
        return a/b;
    }
        @Override
    public int multiplicacion(int a, int b) {
        return a*b;
    }
      @Override
    public int modulo(int a, int b) {
        return a%b;
    }
     @Override
    public double elevado(int a, int b) {
        return Math.pow(a, b);
    }
    
    
    
    
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

   

  


   


    
    

   
    
}
