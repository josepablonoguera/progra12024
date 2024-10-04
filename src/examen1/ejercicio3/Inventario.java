/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1.ejercicio3;

/**
 *
 * @author ucr
 */
public class Inventario {

    Producto[] inventario = new Producto[5];
    int i = 0;

    public void agregarProducto(Producto producto) {
        inventario[i] = producto;
        i++;
    }
    
    public Producto buscarProductoPorCodigo(String codigo){
    
        for (int j = 0; j < inventario.length; j++) {
            if (inventario[j].getCodigo().equals(codigo)) {
                return inventario[j];
            }
        }
     return null;    
    }
    
    public void mostrarInventario(){
    
        for (int j = 0; j < inventario.length; j++) {
            if (inventario[i] != null) {
                System.out.println(inventario[j].mostarInfo());
            }
        }
    }

}
