/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import javax.swing.JApplet;
import javax.swing.*;
import java.awt.Graphics; 
/**
 *
 * @author Pricila Romero
 */
public class Analisis extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */String salida;//cadena de salida
     @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
        
        int aprobados = 0;//numero de aprobados
int reprobados = 0;//numero de reprobados
int contadorEstudiantes = 1;//contador de estudiantes
int resultado;//resultado de un examen
String entrada;//valor introducido por el usuario
 //procesar 10 estudiantes utilizando un ciclo
while ( contadorEstudiantes<= 10 ){
 //pedir al usuario la entrada del valor a traves
 //de una ventana de entrada
entrada = JOptionPane.showInputDialog("Escriba el resultado (1 = aprobado, 2 =reprobado)" );
 //convertir resultado en int
resultado = Integer.parseInt( entrada);
 //si resultado es 1, incrementar aprobados;
 //if..else anidado en while
if (resultado == 1 )
aprobados = aprobados + 1;
else
reprobados = reprobados + 1;
 //incrementar contador de estudiantes para que el ciclo termine
 //eventualmente
contadorEstudiantes++;
 } //fin del while
//fase de terminación: preparar y mostrar resultados
salida = " Aprobados: " + aprobados + "\n Reprobados: " +
reprobados;
 //mostrar los resultados en la ventana de mensaje
JOptionPane.showMessageDialog(null, salida,"Analisis deresultados de examen",JOptionPane.INFORMATION_MESSAGE );
 } //fin de init
     @Override
     public void paint(Graphics g){
super.paint(g);
g.drawRect(15,10,270,20);
        g.drawString(salida,25,25); 
    }

    // TODO overwrite start(), stop() and destroy() methods
}
