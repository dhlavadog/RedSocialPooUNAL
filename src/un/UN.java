/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package un;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class UN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
   {
       Scanner leer = new Scanner(System.in);
        int opcion[] = new int[2];
        
        Usuario usuario[] = new Usuario[10];
        for(int i = 0; i<10; i++) usuario[i] = new Usuario();
        Grupo grupo[] = new Grupo[10];
        
        Fotografia foto[]= new Fotografia[10];
        String nombre, apellido,nick,clave,correo, descripcion,tipo,etiqueta;
        int edad, n = 0;
        boolean menu = true;
        
    while(menu == true)
    {
          
        
        System.out.println("RED SOCIAL POO UNAL");
        System.out.println("1. Usuarios");
        System.out.println("2. Crear grupo");
        System.out.println("3. Crear fotografia");
        System.out.println("4. Salir\n");
        System.out.println("Ingrese una de las Opciones");
        opcion[0]= leer.nextInt();
        switch(opcion[0])
        {
            case 1 : System.out.println("USUARIOS");
                     System.out.println("1. Registrar Usuario");
                     System.out.println("2. Ver usuarios registrados");
                     opcion[1] = leer.nextInt();
                     switch(opcion[1])
                     {
                         case 1 : System.out.println("Ingrese nombre");
                                  nombre = leer.next();
                                  System.out.println("Ingrese apellido");
                                  apellido = leer.next();
                                  System.out.println("Ingrese nickname");
                                  nick = leer.next();
                                  System.out.println("Ingrese edad");
                                  edad = leer.nextInt();
                                  System.out.println("Ingrese clave");
                                  clave = leer.next();
                                  System.out.println("Ingrese correo");
                                  correo = leer.next();
                                  usuario[n] = new Usuario(nombre,apellido,nick,edad,clave,correo);
                                  break;
                         case 2 : System.out.println("USUARIOS REGISTRADOS");
                                  for(int i=0; i<=n; i++)
                                  {
                                      System.out.println(usuario[i].getNombre()+" "+usuario[i].getApellido());
                             
                                  }
                                  break;         
                     }
                     
                     
                     
                     break;
                     
            case 2 : System.out.println("CREAR GRUPO\n");
                     System.out.println("Ingrese nombre del grupo");
                     nombre = leer.next();
                     System.out.println("Ingrese Descripcion ");
                     descripcion = leer.next();
                     System.out.println("Que tipo de grupo es ");
                     tipo = leer.next();
                     grupo[0] = new Grupo(nombre,descripcion,tipo,usuario[0]);
                     System.out.println("grupo creado");
                     break;
                     
            case 3 : System.out.println("CREAR FOTOGRAFIA\n");
                     System.out.println("Ingrese nombre");
                     nombre = leer.next();
                     System.out.println("Ingrese descripcion");
                     descripcion = leer.next();
                     System.out.println("¿Desea Etiquerar a alguien?");
                     System.out.println("S/N");
                     etiqueta= leer.next();
                     if(etiqueta.equals("S") || etiqueta.equals("s"))
                        {
                         System.out.println("A quien desea etiquetar");
                         etiqueta = leer.next();
                        }
                     System.out.println("Ingrese coordenadas");
                     int a= leer.nextInt();
                     int b = leer.nextInt();
                     
                     foto[0] = new Fotografia(nombre, descripcion, a, b);
                     break;
            case 4 : menu = false;
                     break;
                    
                    
                     
        }
        
        
        
     n++;   
    }
       System.out.println("Se ha cerrado sesion con exito");
}
}