/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author ucr
 */
public class OperacionesMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][] = {
            {2, 3, 1},
            {4, 5, 2},
            {6, 7, 3}
        };
        int a = matriz[0][0];
        int b = matriz[0][1];
        int c = matriz[0][2];
        int d = matriz[1][0];
        int e = matriz[1][1];
        int f = matriz[1][2];
        int g = matriz[2][0];
        int h = matriz[2][1];
        int i = matriz[2][2];

        int det = (a * ((e * i) - (f * h)))
                - (b * ((d * i) - (f * g)))
                + (c * ((d * h) - (e * g)));
        
        System.out.println(det);
    }

}
