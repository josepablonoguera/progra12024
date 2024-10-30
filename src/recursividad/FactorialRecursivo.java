/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

/**
 *
 * @author ucr
 */
public class FactorialRecursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 1932 053 504    6227 020 800

        //int resultado = factorialIterativo(num);
        //  System.out.println("resultado iterativo = " + resultado);
        System.out.println("Cantidad de digitos" + contarDigitosRecursivo(10));

    }

    private static int contarDigitosRecursivo(int num) {
        //a^b = a × a^(b-1), con a^0 = 1 b=0=1
        //dígitos(n) = 1 + dígitos(n / 10), con dígitos(0) = 0
        if (num == 0) {
            return 0;
        } else {
            return 1 + contarDigitosRecursivo(num / 10);
        }

    }

    private static long factorialIterativo(int num) {

        int resultado = 1;
        for (int i = num; i >= 1; i--) {
            resultado = resultado * i;
        }
        return resultado;
    }

    private static long factorialRecursiva(int num) {

        if (num == 0) {
            return 1;
        } else {
            return num * factorialRecursiva(num - 1);
        }

    }
}
