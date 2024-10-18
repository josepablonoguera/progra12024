/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ucr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
    static Person[] people = new Person[5];

    static int k = 0;

    public static void main(String[] args) throws IOException {
        menu();
    }

    private static void menu() throws IOException {

        System.out.println("****** Hola, Sistema de matrícula ******");
        System.out.println("Menú");
        System.out.println("1. Administrativo");
        System.out.println("2. Salir");
        int opc = 0;
        try {
            opc = Integer.parseInt(br.readLine());
        } catch (IOException iOException) {
            System.out.println("No era una opcion del menú");
            menu();
        } catch (NumberFormatException numberFormatException) {
            menu();
        }

        switch (opc) {
            case 1:
                menuAdmin();
                break;
            case 2:
                System.out.println("Gracias por usar el sistema");
                System.exit(0);
                break;

            default:
                System.out.println("No era una opción valida del menú");
                menu();
        }

    }

    private static void menuAdmin() throws IOException {
        System.out.println("Menú Administrativo");
        System.out.println("1. Registrar Personas");
        System.out.println("2. Mostrar Personas");
        System.out.println("3. Regresar");
        int opc = 0;
        try {
            opc = Integer.parseInt(br.readLine());
        } catch (IOException iOException) {
            System.out.println("No era una opcion del menú administrativo");
            menuAdmin();
        } catch (NumberFormatException numberFormatException) {
            menu();
        }

        switch (opc) {
            case 1:
                people[k] = registrar();
                k++;
                menuAdmin();
                break;
            case 2:
                mostrarPersonas();
                menuAdmin();
                break;
            case 3:
                menu();
                break;

            default:
                System.out.println("No era una opción valida del menú");
                menuAdmin();
        }

    }

    private static Person registrar() throws IOException {
        System.out.println("1. Estudiante");
        System.out.println("2. Profesor");
        System.out.println("3. Regresar");
        int opc = 0;
        try {
            opc = Integer.parseInt(br.readLine());
        } catch (IOException iOException) {
        } catch (NumberFormatException numberFormatException) {
        }
        if (opc == 1) {
            System.out.println("Rango de edad:");
            int rango = Integer.parseInt(br.readLine());
            System.out.println("");
            System.out.println("Escolaridad:");
            String escolaridad = br.readLine();
            System.out.println("");
            return new Student(rango, escolaridad, "1", "Juanito Mora",
                    new Contact(null, null, "Golfito"));
        }
        if (opc == 2) {
            System.out.println("Especialidad:");
            String especialidad = br.readLine();
            System.out.println("");
            System.out.println("Lenguaje:");
            String lenguaje = br.readLine();
            System.out.println("");
            return new Profesor(especialidad, lenguaje,
                    "PRF -1 ", "Pablo Noguera",
                    new Contact(null, null, "Ciudad Neily"));
        }
        return null;
    }

    private static void mostrarPersonas() {

        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) {
                System.out.println("Persona: " + people[i].toString());
            }

        }
    }

}
