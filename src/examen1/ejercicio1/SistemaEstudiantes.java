/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1.ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ucr
 */
public class SistemaEstudiantes {

    static Estudiante[] estudiantes = new Estudiante[3];

    public static void main(String[] args) throws IOException {
        crearEstudiante();
        mostarRegistro();

    }

    public static void mostarRegistro() {
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i].toString());
        }
    }

    public static void crearEstudiante() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < estudiantes.length; i++) {
            Estudiante est = new Estudiante();
            System.out.println("Ingrese el nombre:");
            String name = br.readLine();
            System.out.println("Ingrese el carnet");
            String carnet= br.readLine();
            System.out.println("Ingrese las 5 notas:");
            for (int j = 0; j < est.notas.length; j++) {
                System.out.println("Nota "+(j +1)+" :");
                double nota = Double.parseDouble(br.readLine());
                est.notas[j]= nota;
            }
            est.carnet=carnet;
            est.nombre= name;   
            estudiantes[i] = est;
        }
    }

}
