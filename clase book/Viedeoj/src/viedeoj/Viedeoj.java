/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viedeoj;

/**
 *
 * @author Pricila Romero
 */
public class Viedeoj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Personajeprin p= new Personajeprin();//los llamamos
         ZombieHumano zh= new ZombieHumano();
         Zombieanimal za= new Zombieanimal();
         Enemigo obj;
         obj =Fabrica.generarEnemido("ejefe");
         obj =Fabrica.generarEnemido("eanimal");
         obj =Fabrica.generarEnemido("etroll");
    }
    
}
