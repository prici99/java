/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication44;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Pricila Romero
 */
public class JavaApplication44 {

   Elemntos elemento = new Elemntos();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nom;
       
       double elec,calor;
       int pt,ws;
       Scanner pr = new Scanner(System.in);        
       System.out.println("cuantos elementos desea ingresar");
       pt=pr.nextInt();
       double[] calorn = new double[pt];
       double[] elecn = new double[pt];
       String[] nombre = new String[pt] ;
       for(int i=0;i<pt;i++){
           nombre[i]="";
           elecn[i]=0.0;
           calorn[i]=0.0;
       }
       ArrayList<Double> electlista = new ArrayList<Double>();
       ArrayList<Double> calorlist = new ArrayList<Double>();
       for(int i=1;i<=pt;i++){
       System.out.println("Ingrese nombre");
       nombre[i-1]=pr.next();
       System.out.println("Ingrese su conductividad electrica");
       elecn[i-1]=pr.nextDouble();
       electlista.add(elecn[i-1]);
       System.out.println("Ingrese su conductividad termina");
       calorn[i-1]=pr.nextDouble();
       calorlist.add(calorn[i-1]);
       }
       double[] extremos={0.0,0.0,0.0,0.0};
       int[] indices={0,0,0,0};
       int pn=0;
       Collections.sort(electlista);
       for(double np:electlista){
           if(pn==0){
               extremos[0]= np;
           }else if(pn==pt-1){
               extremos[2]=np;
           }   
           pn++;
       }
       pn=0;
       Collections.sort(calorlist);
       for(double np:calorlist){
           if(pn==0){
               extremos[1]= np;
           }else if(pn==pt-1){
               extremos[3]=np;
           }   
           pn++;
       }
       for(int i=0;i<pt;i++){
           if(elecn[i]==extremos[0]){
               indices[0]=i;
           }else if(elecn[i]==extremos[2]){
               indices[2]=i;
           }else if(calorn[i]==extremos[1]){
               indices[1]=i;
           }else if(calorn[i]==extremos[3]){
               indices[3]=i;
           }
       }
       System.out.println("el mejor conductor de electricidad es: "+nombre[indices[2]]+extremos[2]);
       System.out.println("el mejor conductor de calor es: "+nombre[indices[3]]+extremos[3]);
       System.out.println("el peor conductor de electricidad es: "+nombre[indices[0]]+extremos[0]);
       System.out.println("el peor conductor de calor es: "+nombre[indices[1]]+extremos[1]);
       
       
    
    
    }
      
       
       
    
    
}