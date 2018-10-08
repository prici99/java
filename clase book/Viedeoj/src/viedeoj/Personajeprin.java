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
public class Personajeprin extends  Actor{
    String PuntosdeVida;
    /**SET y get**/
    @Override
    public void caminar()
    {
        System.out.println("caminando en x por medio del teclado");
    }
    @Override
    public void saltar()
    {
        System.out.println("saltando en y, oreden por medio de tecla enter");
    }
}
