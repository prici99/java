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
public class Fabrica {
    public static Enemigo generarEnemido(String tipo)
    {
        if(tipo.equals("ehumano"))
        {
            return new ZombieHumano();
        }
        if(tipo.equals("eanimal"))
        {
            return new ZombieAnimal();
        }
        if(tipo.equals("etroll"))
        {
            return new Troll();
        }
        
        return null;
            
    }
}
