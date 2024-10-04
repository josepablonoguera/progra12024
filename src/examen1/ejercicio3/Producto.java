/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1.ejercicio3;

/**
 *
 * @author ucr
 */
public class Producto {

    private String codigo;
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String codigo, String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void agregarStock(int cantidad) {
        this.setCantidad(this.getCantidad() + cantidad);
    }

    public void reducirStock(int cantidad) {
        if (this.getCantidad() > 3) {
            this.setCantidad(this.getCantidad() - cantidad);
        }else{
            System.out.println("Reponer Producto");
        }
    }
    
    public String mostarInfo(){
       return this.toString();
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + getCodigo() + ", nombre=" + getNombre() + ", precio=" + getPrecio() + ", cantidad=" + getCantidad() + '}';
    }
    
    

}
