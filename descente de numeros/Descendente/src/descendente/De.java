/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descendente;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Pricila Romero
 */
public class De extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    static Descu descuu;
    ArrayList<Descu> descuentos= new ArrayList();
    int cann;
    int contador=0;
    double tot;
     double precio=8.5;
     double dess;
    @Override
    public void init() {
        int canti;//para tomar los valores de la cantidad de docenas que desea
        int ob;
             double d;
             double totapagar;
        // TODO start asynchronous download of heavy resources
        JOptionPane.showMessageDialog(null, "BIENVENIDO A TIENDA LOMITAS, disfrute de nuestra super oferta"
                + "llevando café con el 15 y 10 % en sus compras por docenas");
        String h=JOptionPane.showInputDialog("Escriba el nombre del cliente" );
      cann=Integer.parseInt(h);
      for(int i=0; i<=cann; i++) {
            Descu des= new Descu();
             des.nombre=JOptionPane.showInputDialog("Escriba el nombre del cliente" );
             des.cantidad=JOptionPane.showInputDialog("Escriba el numero de docenas que compro minimo 1 " );
              
              canti=Integer.parseInt(des.cantidad);
               if(canti==1 || canti==2)
        {
           
            
             tot=(canti*precio);
            d=0.10;
             des.descuento=String.valueOf(d);
            dess=(tot*d);
             totapagar=(tot - dess);
            des.totdescu=String.valueOf(totapagar);
            ob=0;
            des.obsequi=String.valueOf(ob);
           
           
         }
        if(canti==3)
        {
               
             tot=(canti*precio);
            d=0.15;
             des.descuento=String.valueOf(d);
            dess=(tot*d);
            totapagar=(tot - dess);
            des.totdescu=String.valueOf(totapagar);
            ob=0;
            des.obsequi=String.valueOf(ob);
           
           
        } 
       if(canti>3)
        {
             
             tot=(canti*precio);
            d=0.10;
             des.descuento=String.valueOf(d);
            dess=(tot*d);
             totapagar=(tot - dess);
            des.totdescu=String.valueOf(totapagar);
            ob=(0+canti);
            des.obsequi=String.valueOf(ob);
           
           
        } 
            descuentos.add(des);
           
        }
      
      
  
   
    }

    // TODO overwrite start(), stop() and destroy() methods
    @Override
     public void paint(Graphics g){
super.paint(g);
g.drawRect(10,3,330,153);
g.drawString("Nombre",20,15);
g.drawString("Descuento",83,15);
g.drawString("Docenas",153,15);
g.drawString("total",225,15);
g.drawString("obsequios",276,15);

    
 int k=35;
 for (Descu j:descuentos){
        
        g.drawString(j.nombre,20,k);
             g.drawString("_____________________________________________",15,k);
            g.drawString("|",75,k);
            g.drawString("|",145,k);
            g.drawString("|",210,k);
            g.drawString("|",274,k);
          g.drawString(j.descuento,100,k);
          g.drawString(j.cantidad,155,k);
                  g.drawString("Dna",177,k);
                  g.drawString(j.totdescu,228,k);
                  g.drawString(j.obsequi,280,k);
                 g.drawString("Ud",297,k);
            k+=20;
 }
         

            
           
    // TODO overwrite start(), stop() and destroy() methods
}
}


