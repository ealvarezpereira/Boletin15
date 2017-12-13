/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b15ej1;

import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class PruebasEscritas {
    
    private double notaParcial;
    public double notaFinalEscrita;
    private double notaPrimero;
    private double notaSegundo; 
    
    public void calcularNotasEscritas(){
        JOptionPane.showMessageDialog(null, "Pruebas escritas.");
        notaPrimero= Double.parseDouble(JOptionPane.showInputDialog("Introduzca la nota del primer examen."));      
        notaSegundo= Double.parseDouble(JOptionPane.showInputDialog("Introduzca la nota del segundo examen."));
        
        notaParcial = (notaPrimero+notaSegundo)/2;
        
        notaFinalEscrita = notaParcial*40/100;
    }   
}
