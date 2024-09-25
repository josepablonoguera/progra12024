/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ClaseString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Random;

/**
 *
 * @author ucr
 */
public class ClaseString {

    // Códigos ANSI para colores de texto
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_MAGENTA = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    // Códigos ANSI para colores de fondo
    public static final String ANSI_BG_BLACK = "\u001B[40m";
    public static final String ANSI_BG_RED = "\u001B[41m";
    public static final String ANSI_BG_GREEN = "\u001B[42m";
    public static final String ANSI_BG_YELLOW = "\u001B[43m";
    public static final String ANSI_BG_BLUE = "\u001B[44m";
    public static final String ANSI_BG_MAGENTA = "\u001B[45m";
    public static final String ANSI_BG_CYAN = "\u001B[46m";
    public static final String ANSI_BG_WHITE = "\u001B[47m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String ca = "";
        
        
//         for (int j = 0; j < 10; j++) {
//            char[] letras = new char[50];
//            for (int i = 0; i < letras.length; i++) {
//                letras[i] = (char) new Random().nextInt(100);
//            }
//            
//            String cadena = new String(letras, 0, letras.length);            
//            
//            System.out.println("cadena = " + cadena);
//             System.out.println("");
//        }
//        
        // Imprimir texto con todos los colores de fondo y letras
        for (String bg : new String[]{
            ANSI_BG_BLACK, ANSI_BG_RED, ANSI_BG_GREEN, ANSI_BG_YELLOW,
            ANSI_BG_BLUE, ANSI_BG_MAGENTA, ANSI_BG_CYAN, ANSI_BG_WHITE}) {
            for (String fg : new String[]{
                ANSI_BLACK, ANSI_RED, ANSI_GREEN, ANSI_YELLOW,
                ANSI_BLUE, ANSI_MAGENTA, ANSI_CYAN, ANSI_WHITE}) {
                System.out.print(bg + fg + " Texto " + ANSI_RESET);
            }
            System.out.println(); // Nueva línea después de cada fila de colores
        }

        String datos = "Letra: José María Zeledón , Música: "
                + "Manuel María Gutiérrez";
        String cancion = "Noble patria, tu hermosa bandera -"
                + " expresión de tu vida nos da; - "
                + "bajo el límpido azul de tu cielo"
                + " - blanca y pura descansa la paz. /"
                + "En la lucha tenaz, de fecunda labor - que enrojece del hombre"
                + " "
                + "la faz, - conquistaron tus hijos labriegos sencillos - "
                + "eterno prestigio, estima y honor. / "
                + "¡Salve, oh tierra gentil! - ¡Salve, oh madre de amor! /"
                + " Cuando alguno pretenda - tu gloria manchar, -"
                + " verás a tu pueblo valiente y viril, - la tosca "
                + "herramienta en arma trocar. / "
                + "Salve oh Patria tú pródigo suelo, - dulce abrigo "
                + "y sustento nos da; - bajo el límpido azul de tu cielo "
                + "- ¡vivan siempre el trabajo y la paz!";
        System.out.println("Himno Nacional de Costa Rica\n");
        getMusicNameSong(datos);
        System.out.println("");
        //getEstrofas(cancion);
        //existeString(cancion);
        karaoke(cancion);

    }

    public static void existeString(String cancion) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(ANSI_WHITE + ANSI_BG_BLUE + "Ingrese la cadena a buscar: ");
        if (aBuscar(cancion, br.readLine())) {
            System.out.println("Existe");
        } else {
            System.out.println("No existe");
        }
    }

    public static void getEstrofas(String cancion) {

        String estrofas[] = cancion.split("/");
        for (int i = 0; i < estrofas.length; i++) {
            String barras[] = estrofas[i].split("-");
            for (int j = 0; j < barras.length; j++) {
                System.out.println(barras[j]);

            }
            System.out.println("");
        }
    }

    public static void getMusicNameSong(String datos) {
        String partes[] = datos.split(",");

        System.out.println(partes[0].trim());
        System.out.println(partes[1].trim());
    }

    private static boolean aBuscar(String cancion, String aBuscar) {

        return cancion.indexOf(aBuscar.toString()) >= 0;
    }

    private static void karaoke(String cancion) {
        int velocidad = 550;
        String estrofas[] = cancion.split("/");
        for (int i = 0; i < estrofas.length; i++) {
            String barras[] = estrofas[i].split("-");
            for (int j = 0; j < barras.length; j++) {

                String palabras[] = barras[j].split(" ");

                for (int k = 0; k < palabras.length; k++) {
                    if (palabras[k].startsWith("¡Salve,")) {
                        velocidad = velocidad + 300;
                    } else {
                        velocidad = 550;
                    }
                    if (j == 0) {
                        System.out.print(ANSI_BG_BLUE + ANSI_WHITE + " " + palabras[k].trim());
                    }
                    if (j == 1) {
                        System.out.print(ANSI_BG_WHITE + ANSI_BLACK + " " + palabras[k].trim());
                    }
                    if (j == 2) {
                        System.out.print(ANSI_BG_RED + ANSI_BLACK + " " + palabras[k].trim());
                    }
                    if (j == 3) {
                        System.out.print(ANSI_BG_WHITE + ANSI_BLACK + " " + palabras[k].trim());
                    }
                    try {
                        Thread.sleep(velocidad);
                    } catch (InterruptedException iE) {
                        System.err.println(iE.getLocalizedMessage());
                    }
                }
                System.out.println("");

            }
            System.out.println("");
        }
    }

}
