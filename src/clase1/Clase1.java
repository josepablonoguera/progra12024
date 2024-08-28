package clase1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Clase1 {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el texto para contar sus vocales: ");
        int [] totalVocales = contarVocales(br.readLine());
        
            System.out.println("Vocales A: "+totalVocales[0]);
            System.out.println("Vocales E: "+totalVocales[1]);
            System.out.println("Vocales I: "+totalVocales[2]);
            System.out.println("Vocales O: "+totalVocales[3]);
            System.out.println("Vocales U: "+totalVocales[4]);
            
       
    }

    public static int[] contarVocales(String texto) {
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;
        int tam = texto.length();
        texto = texto.toUpperCase();
        for (int i = 0; i < tam; i++) {
            if (String.valueOf(texto.charAt(i)).contains("A")) {
                contadorA++;
            }
            if (String.valueOf(texto.charAt(i)).contains("E")) {
                contadorE++;
            }
            if (String.valueOf(texto.charAt(i)).contains("I")) {
                contadorI++;
            }
            if (String.valueOf(texto.charAt(i)).contains("O")) {
                contadorO++;
            }
            if (String.valueOf(texto.charAt(i)).contains("U")) {
                contadorU++;
            }

        }
        int letras[] = {contadorA,contadorE,contadorI,contadorO,contadorU};
       
        return letras;
    }

}
