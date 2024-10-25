/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package INTERFACES;

/**
 *
 * @author ucr
 */
public abstract class Animal implements InterfaceComportamiento {

    int tamanno;
    String especie;
    double peso;
    String tipoAlimento;

    public Animal() {
    }

    public Animal(int tamanno, String especie, double peso,
            String tipoAlimento) {
        this.tamanno = tamanno;
        this.especie = especie;
        this.peso = peso;
        this.tipoAlimento = tipoAlimento;
    }

    @Override
    public String toString() {
        return "Animal{" + "tamanno=" + tamanno + ", especie=" + especie + ", peso=" + peso + ", tipoAlimento=" + tipoAlimento + '}';
    }
    

   
}
