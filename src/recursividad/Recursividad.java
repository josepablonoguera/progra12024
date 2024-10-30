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
//        int base = 2;
//        int exponente = 35;
//        int resultado = potencia(base, exponente);
//        System.out.println("resultado iterativo = " + resultado);
//        int resultado2 = potenciaRecursiva(base, exponente);
//        System.out.println("resultado recursivo = " + resultado2);

//        int vector[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        double promedio = promedioVector(vector);
//        System.out.println("promedio = " + promedio);
//        
//        double promedioRecursividad = promedioRecursivo(vector, vector.length-1) / vector.length;
//        System.out.println("Promedio Recursivo = " + promedioRecursividad);
        int matriz[][] = {
            {100, 2, 3},
            {4, 35, 600},
            {7, 8, 99}
        };
//        int suma = 0;
//        for (int i = 0; i < matriz.length; i++) {
//
//            suma = suma + matriz[i][i];
//
//        }
//        System.out.println("Suma: " + suma);
//
//        int sumaRecursiva = sumaDiagonal(matriz, matriz.length - 1, matriz[0].length - 1);
//        System.out.println("sumaRecursiva = " + sumaRecursiva);

//        int sumaMatriz = sumamatriz(matriz, matriz.length - 1, matriz[0].length - 1);
//        System.out.println("sumaMatriz = " + sumaMatriz);

    int mayor = encontrarMayor(matriz, 0, 0, matriz[0][0]);
        System.out.println("mayor = " + mayor);



    }

    private static int sumaDiagonal(int mat[][], int i, int j) {

        if (i >= 0 && j >= 0 && i == j) {
            return sumaDiagonal(mat, i - 1, j - 1) + mat[i][j];
        }

        return 0;
    }

    private static int sumamatriz(int mat[][], int i, int j) {

        if (i == mat.length - 1 && j == mat[0].length - 1) { // llegamos al inicio de la matriz
            return mat[i][j]; // ultimo
        }

        if (j == mat[0].length - 1) {   // reducir la fila y resetear j 

            return sumamatriz(mat, i + 1, 0) + mat[i][j];
        }

        return sumamatriz(mat, i, j + 1) + mat[i][j];
    }

    private static int encontrarMayor(int mat[][], int i, int j, int mayor) {

        if (i == mat.length - 1 && j == mat[0].length - 1) { // llegamos al final de la matriz

            if (mat[i][j] > mayor) {
                return mat[i][j];
            }
            return mayor; // ultimo
        }

        if (j == mat[0].length - 1) {   // reducir la fila y resetear j 
            if (mat[i][j] > mayor) {
                mayor = mat[i][j];
            }
            return encontrarMayor(mat, i + 1, 0, mayor);
        }

        if (mat[i][j] > mayor) {
            mayor = mat[i][j];
        }

        return encontrarMayor(mat, i, j + 1, mayor);
    }

    private static int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 1; i <= exponente; i++) {
            resultado = base * resultado;
        }
        return resultado;
    }

    private static int potenciaRecursiva(int base, int expo) {

        if (expo == 0) {
            return 1;
        }
        if (expo == 1) {
            return base;
        }
        return potenciaRecursiva(base, expo - 1) * base;

    }

    private static double promedioVector(int[] vector) {
        double suma = 0.0;
        for (int i = 0; i < vector.length; i++) {
            suma = suma + vector[i];
        }
        return suma / vector.length;
    }

    private static double promedioRecursivo(int vector[], int tam) { //10   
        if (tam == 0) {
            return vector[0];
        }
        return promedioRecursivo(vector, tam - 1) + vector[tam];
    }

}
