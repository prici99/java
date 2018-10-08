/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenum;//LEYDI PRICILA ROMERO PALACIOS
//RP17032

/**
 *
 * @author Pricila Romero
 */
public class CadeNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        int i;//variable para recorrer en un for
        int j = 0;
        System.out.println("la serie de numeros es");//mostrar un texto
        for(i=2; i<=1800; i++)//for que recorrera la serie hasta 1800
        {
            
            System.out.println(i);//se imprimiran los valores de i
           i+=4;
           j=(i-1);
           System.out.println(j);//se imprimiran los valores j
        }
        System.out.println("la suma es");//mensaje
        System.out.println(i+j);//muestra la suma total de los numeros
    }
    
}
