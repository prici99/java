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
public abstract class Actor { //absatract para hacer atrasta
    String nombre;
    int vidas;
    String poder;
    String debilidad;
    String armas;
    //metodos para administradar los atributos
    //meter metodos para cada uno
    public void  SetNombre(String nom)//set no retorno solo pone valor en la memoria
    {
        this.nombre=nom;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    //metodos de acciones
    public abstract void caminar();
    
     public abstract void saltar();//publica para que las demas clases las veas no retornran ningun dato
    
    }

