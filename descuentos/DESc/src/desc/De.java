/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desc;

import javax.swing.JApplet;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
/**
 *
 * @author Pricila Romero
 */
public class De extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
      double precio=8.5;
        double des;
        double pretotal;
        int cantidad;
        double tot;
        double pret;
        String can;
        String obsequio;
        int contador=0;
        int obs=0;
         static int prue;
      String n,e;
        double ob;
        
        int lib[]= new int[2];
      
     ArrayList<String> ejemploLista = new ArrayList<>();
     ArrayList<String> ejemploList= new ArrayList<>();
     ArrayList<String> ejemploLis = new ArrayList<>();
     ArrayList <String>ejemploLi = new ArrayList<>();
     ArrayList<String> ejemplo = new ArrayList<>();
     
     @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
     
    

        // TODO start asynchronous download of heavy resources
        JOptionPane.showMessageDialog(null, "BIENVENIDO A TIENDA LOMITAS, disfrute de nuestra super oferta"
                + "llevando café con el 15 y 10 % en sus compras por docenas");
       while(contador<=1)
       {
         e=JOptionPane.showInputDialog("Escriba el nombre del cliente" );
         ejemploLista.add(e);
         
        n=JOptionPane.showInputDialog("Escriba el numero de docenas que compro minimo 1 " );
        
        cantidad= Integer.parseInt(n);
       
        ejemploList.add(n);
       
        
         
        if(cantidad==1 || cantidad==2)
        {
             tot=(cantidad*precio);
            des=(tot*0.10);
            pretotal=(tot-des);
            obs=(obs+0);
            can=String.valueOf(pretotal);
            ejemploLis.add(can);
             obsequio=String.valueOf(obs);
            ejemploLi.add(obsequio);
            
         }
        if(cantidad==3)
        {
            tot=(cantidad*precio);
            des=(tot*0.15);
            pretotal=(tot-des);;
            obs=(obs+1);
            
           can=String.valueOf(pretotal);
            ejemploLis.add(can);
            obsequio=String.valueOf(obs);
            ejemploLi.add(obsequio);
        } 
       if(cantidad>3)
        {
            tot=(cantidad*precio);
            des=(tot*0.15);
            pretotal=(tot-des);;
            obs=(obs+cantidad);
            
           can=String.valueOf(pretotal);
            ejemploLis.add(can);
            obsequio=String.valueOf(obs);
            ejemploLi.add(obsequio);
        } 
        contador++;
  
        }      
   
    }
    @Override
     public void paint(Graphics g){
super.paint(g);
g.drawRect(10,3,330,153);
g.drawString("Nombre",20,15);
g.drawString("Descuento",83,15);
g.drawString("Docenas",153,15);
g.drawString("total",225,15);
g.drawString("obsequios",276,15);
int i;

            int k=35;
              for(String j : ejemploLista) {
                g.drawString(j,20,k);
                 
                 g.drawString("_____________________________________________",15,k);
                 g.drawString("|",75,k);
            g.drawString("|",145,k);
            g.drawString("|",210,k);
            g.drawString("|",274,k);
   
                    g.drawString("15%",100,k);     
            k+=20;
              }  

           if(cantidad==1 || cantidad==2 ||cantidad>=3 )
        {
              int l=35;
              for(String j: ejemploList) {
                 
                g.drawString(j,155,l);
                  g.drawString("Dna",177,l);
                   l+=20;
                      }
              int t=35;
              for(String j: ejemploLis) {
                 
                g.drawString(j,228,t);
                
                   t+=20;
                      }
              int h=35;
              for(String j: ejemploLi) {
                 
                g.drawString(j,280,h);
                 g.drawString("Ud",297,h);

                   h+=20;
                      }
        
         }
           
    // TODO overwrite start(), stop() and destroy() methods
}
}


