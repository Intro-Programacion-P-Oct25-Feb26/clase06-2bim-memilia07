/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author USER_ASUS
 */
public class ejercicios {

    public static void main(String[] args) {

        int valor1 = ingresarValor();
        int valor2 = ingresarValor();
        int suma = obtenerSuma(valor1, valor2);
        imprimir(valor1, valor2, suma);

    }

    public static int ingresarValor() {
        int valor = 0;
        boolean bandera = true;
        while (bandera) {
            try {
                Scanner entrada = new Scanner(System.in);

                System.out.println("Ingrese valor:");
                valor = entrada.nextInt();

                if (valor % 2 != 0) {
                    throw new Exception("Numero impar");
                } else {
                    if (valor < 0) {
                        throw new Exception("Numero impar");
                    }
                    bandera = false;

                }
            } catch (Exception e) {

                System.out.printf("Existe un error de tipo %s\n",
                        e);
            }
        }
        return valor;
    }

    public static int obtenerSuma(int a, int b) {
        int suma;
        suma = a + b;
        return suma;
    }

    public static void imprimir(int a, int b, int c) {
        System.out.printf("La suma de: %s y %s es de %s:", a, b,c);
    


    }

}
