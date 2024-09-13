/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase1;

/**
 *
 * @author ucr
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 28;
        for (int i = 0; i < 15000000; i++) {
            if (esPerfecto(i)) {
                System.out.println("Es perfecto " + i);
            }
        }
    }

    public static boolean esPerfecto(int numero) {
        boolean esPerfecto = true;
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma = suma + i;
            }
        }
        if (suma != numero) {
            esPerfecto = false;
        }
        return esPerfecto;
    }

    public static boolean esPalindromo(int numero) {
        boolean esPalindromo = true;
        String num = String.valueOf(numero);
        int size = num.length();
        int index = 0;
        int[] arrayNum = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            arrayNum[index] = num.charAt(i);
            index++;
        }
        for (int i = 0; i < size; i++) {
            if (arrayNum[i] != num.charAt(i)) {
                esPalindromo = false;
                return esPalindromo;
            }
        }
        return esPalindromo;
    }
}
