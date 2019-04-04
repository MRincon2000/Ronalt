/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

/**
 *
 * @author jdiazga
 */
import java.util.*;
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");
        System.out.println("sapo HPTA");
        System.out.println("sali con tu mujer");
        Scanner lectura=new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int numero= lectura.nextInt();
        System.out.println("ingrese el segundo numero");
        int numero2= lectura.nextInt();
        System.out.println("suma: " + (numero + numero2));
        System.out.println("multiplicacion: " + numero * numero2);
    }
}
