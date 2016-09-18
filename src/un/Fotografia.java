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
    private String etiquetados[];
    private int x;
    private int y;
    
   
    
    Fotografia(String n, String d, int x, int y)
    {
        this.nombre = n;
        this.descripcion = d;
        this.x = x;
        this.y = y;
    }
    
    public void getFoto()
    {
        System.out.println(this.nombre);
        System.out.println(this.descripcion);
    }
    
    public void etiquetar(int a, int b)
    {
        this.x = a;
        this.y = b;
        
    }
    
    
    
}
