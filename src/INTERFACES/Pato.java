/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package INTERFACES;

/**
 *
 * @author ucr
 */
public class Pato extends Animal implements ComportamientosPatos {

    public Pato() {
    }

    public Pato(int tamanno, String especie, double peso, String tipoAlimento) {
        super(tamanno, especie, peso, tipoAlimento);
    }

    
    
    @Override
    public void alimentarse(String tipoAlimento) {
   super.tipoAlimento = tipoAlimento;    }

    @Override
    public void dormir() {
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void volar() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void nadar() {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
