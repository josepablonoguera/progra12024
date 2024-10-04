/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1.ejercicio1;

/**
 *
 * @author ucr
 */
public class Estudiante {

    String nombre;
    String carnet;
    double notas[] = new double[5];

    public Estudiante() {
    }
    
    Estudiante(String name, String id, double[] notas) {
        this.carnet = id;
        this.nombre = name;
        this.notas = notas;
    }

    public double calcularNotas() {

        double suma = 0.0;
        for (int i = 0; i < this.notas.length; i++) {
            suma = suma + notas[i];
        }
        return suma / this.notas.length;
    }

    public  void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Carnet: " + this.carnet);
        System.out.println("Promedio: " + calcularNotas());

    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", carnet=" + carnet + ", notas=" + this.calcularNotas() + '}';
    }
    
    

}
