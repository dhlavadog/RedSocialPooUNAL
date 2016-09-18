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
public class Usuario 
{
    private String nombre;
    private String apellido;
    private String nick;
    private int edad;
    private String clave;
    private String correo;
    
    
    Usuario()
    {
        this.nombre = "";
        this.apellido = "";
        this.nick = "";
        this.edad = 0;
        this.clave = "";
        this.correo = "";   
    }
    
    
    Usuario(String n, String a, String nick, int e, String c, String correo )
    {
        this.nombre = n;
        this.apellido = a;
        this.nick = nick;
        this.edad = e;
        this.clave= c;
        this.correo = correo;
    }
    
    public void getUsuario()
    {
        System.out.println("Usuario: ");
        System.out.println(this.nombre+" "+this.apellido);
        System.out.println(this.nick);
        System.out.println(this.edad);
        System.out.println(this.clave);
        System.out.println(this.correo);
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getApellido()
    {
        return this.apellido;
    }
    
}
