/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;
import javax.swing.JOptionPane;
/**
 *
 * @author Pricila Romero
 */
public class Media {
//leydi pricila romero palacios rp17032
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLES
         int peso =0;
         int altura=0;
        String pes,al;
        int contador = 0;
        int cont=0;
        int con=0;
        int resultado = 0;
        int re = 0;
         JOptionPane.showMessageDialog(null, "debe ingresar el peso y altura de 5 peronas");
         while(contador<5)//NUMEROS DE PERSONAS PARA INGRESAR
        {   
           
                //mostraran ensaje de ingresar datos
      pes =JOptionPane.showInputDialog(null,"Escriba el peso"); 
       al =JOptionPane.showInputDialog(null,"Escriba la altura");
      // convertir los números de tipo String a tipo double       
      peso = Integer.parseInt(pes );      //conversion
       altura=Integer.parseInt(al);
            contador++;//contadores
            cont=cont+peso;
            con=con+altura;
          resultado= (cont/contador);//resultaos de peso y altura
          re=(con/contador);
          
        }
         //mensaje que muestra los resultados
          JOptionPane.showMessageDialog(null, "el promedio de peso es: "+resultado);
         JOptionPane.showMessageDialog(null, "el promedio de altura es: "+re);
         //System.out.println();
    }
    
}
