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
public class Boletines {
    
    //Número total de boletines: 17
    private final double totBoletines = 17;
    private double inBoletines;
    private double notaParcial;
    public double notaFinalBoletines;
    private final double notaMas90 = 2, notaEntre90y70 = 1, notaMenos70 = 0;
    
    //El 90% son 15 exactos. Más del 90% ya serían 16.
    //El 70% son 11,9 (12 xdd)
    //Y menos de 12 pues menos del 70%
    
    public void introducirBoletines(){
        JOptionPane.showMessageDialog(null, "Boletines.");
        inBoletines = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de boletines."));
    }
    
    public void calcularNotaBoletines(){
        if (inBoletines > 15){
            JOptionPane.showMessageDialog(null, "Número de boletines: "+inBoletines+"\nNota: "+notaMas90);
            notaParcial = notaMas90;
        } else if (inBoletines >= 12 && inBoletines <= 15){
            JOptionPane.showMessageDialog(null, "Número de boletines: "+inBoletines+"\nNota: "+notaEntre90y70);
            notaParcial = notaEntre90y70;
        } else if (inBoletines < 12){
            JOptionPane.showMessageDialog(null, "Número de boletines: "+inBoletines+"\nNota: "+notaMenos70);
            notaParcial = notaMenos70;
        }
        
        notaFinalBoletines = notaParcial*20/100;
    }
    
}
