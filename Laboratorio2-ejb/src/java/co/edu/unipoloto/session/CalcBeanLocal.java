/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipoloto.session;

import javax.ejb.Local;

/**
 *
 * @author Camilo Gomez
 */
@Local
public interface CalcBeanLocal {

    Integer suma(int a, int b);

    int resta(int a, int b);

    double division(int a, int b);

    int multiplicacion(int a, int b);

    int modulo(int a, int b);

    double elevado(int a, int b);
    
}
