/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

/**
 *
 * @author ucr
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int base = 2;
        int exponente = 35;
        int resultado = potencia(base, exponente);
        System.out.println("resultado iterativo = " + resultado);
        int resultado2 = potenciaRecursiva(base, exponente);
        System.out.println("resultado recursivo = " + resultado2);
    }

    private static int potencia(int base, int exponente) {
        int resultado = 1;        
        for (int i = 1; i <= exponente; i++) {
            resultado = base * resultado;
        }        
        return resultado;        
    }
    
    private static int potenciaRecursiva(int base, int expo){
    
        if (expo ==0) {
            return 1;
        }
        if (expo == 1) {
            return base;
        }        
        return potenciaRecursiva(base, expo-1) * base;   
    
    }
    
}
