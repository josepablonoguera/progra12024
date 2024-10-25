/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package INTERFACES;

/**
 *
 * @author ucr
 */
public class ArcaNoe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal granja [] = new Animal[5];
        Pato patoLucas = new Pato(20, "Tipo 1", 5, "Lombrices");        
        Pato patoDonald = new Pato(70, "Tipo 2", 10, "Semillas");
        Oso pardo = new Oso(200, "pardo", 300, "pescado");        
        Oso polar = new Oso(400, "polar", 350, "focas");
        Jirafa melman = new Jirafa(600, "africana", 350, "hojas");
        
        melman.alimentarse("Zanahorias");
        melman.dormir();
        
        polar.alimentarse("peces");
        polar.dormir();
        polar.crearRefugio();
        polar.hibernar();
        polar.despertar();
        
        patoLucas.alimentarse("Coca Cola");
        patoLucas.dormir();
        patoLucas.volar();
        patoLucas.nadar();
 
        
        
        
        
        granja[0]=patoDonald;
        granja[1]=patoLucas;
        granja[2]=pardo;
        granja[3]=polar;
        granja[4]=melman;
        
        for (int i = 0; i < granja.length; i++) {
            System.out.println(granja[i].getClass().getSimpleName());
            System.out.println(granja[i].toString());
        }
        
        
        
    }
    
}
