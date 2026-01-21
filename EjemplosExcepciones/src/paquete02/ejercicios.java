/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author USER_ASUS
 */
public class ejercicios {

    public static void main(String[] args) {

        int valor1 = ingresarValor();
        int valor2 = ingresarValor();
        

    }

    public static int ingresarValor() {
        boolean bandera = true;
        while (bandera) {
            try{
                Scanner entrada = new Scanner(System.in);

                System.out.println("Ingrese valor 1:");
                int valor1 = entrada.nextInt();
                System.out.println("Ingrese valor 2:");
                int valor2 = entrada.nextInt();

                if (valor1 % 2 == 0 || valor2 % 2 == 0) {
                }
                bandera = false;
            }
        }
        return bandera;
    }

    public static void imprimir() {

    }

    public static int obtenerSuma() {

    }

}
