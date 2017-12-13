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
public class PruebasPracticas {
    
    private double notaParcial;
    public double notaFinal;
    
    public void calcularNotaParcial(){
        JOptionPane.showMessageDialog(null, "Prueba Práctica.");
        notaParcial = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la nota del examen."));
        
        while (notaParcial > 10 || notaParcial < 0){
            notaParcial= Double.parseDouble(JOptionPane.showInputDialog("Nota incorrecta.\nIntroduzca la nota del examen."));
        }
        
        notaFinal = notaParcial*40/100;
    }
    
    
    
}
