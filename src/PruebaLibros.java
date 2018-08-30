/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
import java.util.Scanner;

public class PruebaLibros {
    public static void main(String[] args) {
        //Dependencia
        Scanner entrada = new Scanner(System.in);
        boolean continuar = false;
        int opcion = -1;
        ConjuntoLibros c1 = new ConjuntoLibros();
        System.out.println("Bienvenido a Biblioteca");
        do{
            System.out.println("1. Ingresar libro.");
            System.out.println("2. Listar libros.");
            System.out.println("");
            opcion = entrada.nextInt();
            
            switch (opcion){
                case 1 :
                    //Insertar
                    System.out.println("Ingrese nombre:");
                    System.out.println("Ingrese autor");
                    System.out.println("Ingrese ");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
            
            System.out.println("¿Desea continuar?");
            continuar = entrada.nextBoolean();
        }
        while(continuar);
    }
}
