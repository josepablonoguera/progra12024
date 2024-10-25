/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package INTERFACES;

/**
 *
 * @author ucr
 */
public class Jirafa extends Animal{
    
    
    
    public Jirafa() {
    }

    public Jirafa(int tamanno, String especie, double peso, String tipoAlimento) {
        super(tamanno, especie, peso, tipoAlimento);
    }
   

    @Override
    public void alimentarse( String tipoAlimento) {
    
        System.out.println("La Jirafa se alimenta con: "+ tipoAlimento);
    super.tipoAlimento = tipoAlimento;  
    }

    @Override
    public void dormir() {
        System.out.println("Duerme muy poco");
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
