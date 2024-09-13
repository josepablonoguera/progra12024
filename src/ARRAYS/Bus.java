/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ARRAYS;

public class Bus extends Vehiculo {

    int capacidad;

    public Bus(int capacidad) {
        this.capacidad = capacidad;
    }

    public Bus(int capacidad, double tarifa, String placa) {
        super(tarifa, placa);
        this.capacidad = capacidad;
        super.setTarifa(setTarifaNueva());
    }

    /**
     * Estable la tarifa según la capacidad del Bus
     *
     * @return La tarifa del bus
     */
    public double setTarifaNueva() {
        switch (this.capacidad) {
            case 12:
                return this.getTarifa() * 2;
            case 15:
                return this.getTarifa() * 3;
            case 30:
                return this.getTarifa() * 4;
            case 60:
                return this.getTarifa() * 5;

        }
        return 0.0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bus{capacidad=").append(capacidad);
        sb.append('}');
        return super.toString() + sb.toString();
    }

}