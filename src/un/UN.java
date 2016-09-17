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
        String nombre, apellido,nick,clave,correo;
        int edad,numeroUsuario = 0;
        System.out.println("RED SOCIAL POO UNAL\n");
        System.out.println("Seleccione una opcion:\n");
        System.out.println("1. Registrar Usuario");
        System.out.println("2. Crear grupo");
        System.out.println("3. Crear fotografia");
        opcion[0]= leer.nextInt();
        switch(opcion[0])
        {
            case 1 : System.out.println("REGISTRAR USUARIO\n");
                     System.out.println("Ingrese nombre");
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
                     
                     usuario[0] = new Usuario(nombre,apellido,nick,edad,clave,correo);
                     usuario[0].getUsuario();
    }
    
}
}