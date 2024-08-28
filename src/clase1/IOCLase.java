/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author ucr
 */
public class IOCLase {

    static int numero = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        System.out.println("Determine si su edad es un numero primo");

        int num = digitar();
        System.out.println("edad ingresada: " + num);

        boolean esPrimo = evaluarNumero(num);

        if (esPrimo) {
            System.out.println("Es " + num + " un numero primo");
        } else {
            System.out.println("No es primo");
        }
        System.out.println("numero = " + numero);

    }

    /**
     * El digitar permite recibir un String y convertirlo a numero entero
     * positivo
     *
     * @return numero que es un numero entero positivo
     */
    private static int digitar() throws IOException {

        BufferedReader entrada = new BufferedReader(
                new InputStreamReader(System.in));

        try {
            numero = Integer.parseInt(entrada.readLine());
            if (numero > 0) {

                return numero;
            } else {

                System.out.println("Tiene que ser mayor a cero (0)");
                digitar();
            }
        } catch (NumberFormatException nFE) {
            System.err.println("No es un número entero");
            digitar();
        }
        return numero;
    }

    private static boolean evaluarNumero(int numero) {

        if (numero == 1 || numero == 2) {
            return true;
        }
        if (numero % 2 == 0) {
            return false;
        }
        System.out.println("numero: " + numero);
        for (int i = 3; i <= numero; i += 2) {
            System.out.println("i: " + i);
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

}
