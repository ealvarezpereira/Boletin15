/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b15ej1;

import java.text.DecimalFormat;
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
    DecimalFormat df = new DecimalFormat();

    public void CalculoNotas() {

        op = Integer.parseInt(JOptionPane.showInputDialog("***MENU*** \n1.-Empezar\n2.-Salir"));

        do {
            switch (op) {

                case 1:
                    pp.calcularNotaParcial();
                    pe.calcularNotasEscritas();
                    bo.introducirBoletines();
                    bo.calcularNotaBoletines();
                    notaSuperFinal = pp.notaFinal + pe.notaFinalEscrita + bo.notaFinalBoletines;
                    JOptionPane.showMessageDialog(null, "Pruebas teóricas: " + pe.notaFinalEscrita + "\nPrueba práctica: " + pp.notaFinal + "\nBoletines: " + bo.notaFinalBoletines + "\n\nNota Final: " + df.format(notaSuperFinal));
                    break;

                case 2:
                    break;

                default:
                    while (op != 1 || op != 2){
                    JOptionPane.showMessageDialog(null, "Introduzca un valor válido");
                    op = Integer.parseInt(JOptionPane.showInputDialog("***MENU*** \n1.-Empezar\n2.-Salir"));
                    }
            }

            //Condicion para que al escribir un 2 en el switch anterior salga del programa entero
            if (op == 2) {
                break;
            }
            
            var = JOptionPane.showConfirmDialog(null, "Quieres calcular otra nota?");
            //Switch hecho para 
            switch (var) {

                case JOptionPane.YES_OPTION:
                    op = 1;

                case JOptionPane.NO_OPTION:
                    op = 2;
                    break;

                case JOptionPane.CANCEL_OPTION:
                    JOptionPane.showMessageDialog(null, "Este botón no era, pero ok. Adiós.");
                    op = 2;
                    break;
            }

        } while (op == 1);

    }
}
