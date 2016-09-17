/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package un;

/**
 *
 * @author PC
 */
public class Fotografia 
{
    private String nombre;
    private String descripcion;
    
   
    
    Fotografia(String nombre, String descripcion)
    {
        this.nombre = nombre+".jpg";
        this.descripcion = descripcion;
    }
    
    public void getFoto()
    {
        System.out.println(this.nombre);
        System.out.println(this.descripcion);
    }
    
}
