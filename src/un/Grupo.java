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
public class Grupo 
{
    private String nombre;
    private String descripcion;
    private String tipoGrupo;
    private String noticias;
    private Usuario propietario;
    
    Grupo(String n,String d, String tipo, Usuario p)
    {
        this.nombre = n;
        this.descripcion = d;
        this.tipoGrupo = tipo;
        this.propietario = p;
    }
    
    void getGrupo()
    {
        System.out.println("Nombre del grupo: "+this.nombre);
        System.out.println("Descripcion: "+this.descripcion);
        System.out.println("Tipo de grupo: "+this.tipoGrupo);
        this.propietario.getUsuario();
    }
    
    
    
    
}
