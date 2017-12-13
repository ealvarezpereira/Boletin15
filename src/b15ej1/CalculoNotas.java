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
public class CalculoNotas {

    private double notaSuperFinal;
    private int op, var;
    PruebasPracticas pp = new PruebasPracticas(); //No hace alusión al partido popular.
    PruebasEscritas pe = new PruebasEscritas();
    Boletines bo = new Boletines();

    public void CalculoNotas() {

        op = Integer.parseInt(JOptionPane.showInputDialog("***MENU*** \n1.-Empezar\n2.-Salir"));

        while (op == 1) {
            switch (op) {

                case 1:
                    pp.calcularNotaParcial();
                    pe.calcularNotasEscritas();
                    bo.introducirBoletines();
                    bo.calcularNotaBoletines();
                    notaSuperFinal = pp.notaFinal + pe.notaFinalEscrita + bo.notaFinalBoletines;
                    JOptionPane.showMessageDialog(null, "Pruebas teóricas: " + pe.notaFinalEscrita + "\nPrueba práctica: " + pp.notaFinal + "\nBoletines: " + bo.notaFinalBoletines + "\n\nNota Final: " + notaSuperFinal);
                    break;

                case 2:
                    break;

                default:
                    op = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un valor válido."));
            }
            
            
            var = JOptionPane.showConfirmDialog(null, "Quieres calcular otra nota?");
            
            if (var == JOptionPane.YES_OPTION){
                op = 1;
            }else{
                break;
            }
        }

    }
}
