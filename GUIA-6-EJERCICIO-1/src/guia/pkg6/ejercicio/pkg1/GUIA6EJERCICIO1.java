/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg6.ejercicio.pkg1;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class GUIA6EJERCICIO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /*  String ISBN;
           String Titulo;
           String Autor;
           int numeroDePaginas;
*/
        
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese el ISBN");
        System.out.println("Ingrese el titulo del libro");
        System.out.println("Ingrese el autor del libro");
        System.out.println("Ingrese el número de páginas del libro");
        Libro l1 = new Libro(leer.next(),leer.next(),leer.next(),leer.nextInt());
        
        System.out.println(l1);
        
    }
    
}
