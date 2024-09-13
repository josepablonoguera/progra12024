package ARRAYS;

/**
 * Es para el parqueo de la UCR Sede Sur
 *
 * @author ucr Profe Pablo
 */
public class Parqueo {

    /**
     * Crea un array de Vehículos y muestra la información de las tarifas por
     * Vehículo
     *
     * @param args
     */
    public static void main(String[] args) {
        Object parqueo[] = new Object[4];
        parqueo[0] = new Moto(new Locker(), 500, "654321");
        parqueo[1] = new Auto(false, 1000, "HYT876");
        parqueo[2] = new Bus(60, 2000, "BUS001");
        parqueo[3] = new Vehiculo(2000, "VH-5");

        String[] tipo = {"Moto", "Bus", "Auto", "Vehiculo",};

        for (int i = 0; i < tipo.length; i++) {
            mostrarTarifa(parqueo, tipo[i]);
        }

    }

    /**
     * Muestra la tarifa según el tipo de Vehículo
     *
     * @param parqueo Array de Vehículos
     * @param tipo tipo de Vehículo
     */
    public static void mostrarTarifa(Object[] parqueo, String tipo) {
        System.out.println("Cobro de tarifa " + tipo);
        for (int i = 0; i < parqueo.length; i++) {
            if (tipo.equalsIgnoreCase("Bus")) {
                if (parqueo[i].getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                    Bus bus = (Bus) parqueo[i];
                    System.out.println(bus.getTarifa());
                    System.out.println(bus.toString());
                }
            }
            if (tipo.equalsIgnoreCase("Moto")) {
                if (parqueo[i].getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                    Moto moto = (Moto) parqueo[i];
                    System.out.println(moto.getTarifa());
                    System.out.println(moto.toString());
                }
            }
            if (tipo.equalsIgnoreCase("Auto")) {
                if (parqueo[i].getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                    Auto auto = (Auto) parqueo[i];
                    System.out.println(auto.getTarifa());
                    System.out.println(auto.toString());
                }
            }
            if (tipo.equalsIgnoreCase("Vehiculo")) {
                if (parqueo[i].getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                    Vehiculo vehi = (Vehiculo) parqueo[i];
                    System.out.println(vehi.getTarifa());
                    System.out.println(vehi.toString());
                }
            }
            System.out.println("");
        }
    }

}

class Moto extends Vehiculo {

    Locker locker;

    public Moto(Locker locker) {
        this.locker = locker;
    }

    public Moto(Locker locker, double tarifa, String placa) {
        super(tarifa, placa);
        this.locker = locker;
    }

    @Override
    public String toString() {
        return super.toString() + "Moto{" + "locker=" + locker + '}';
    }

}

class Locker {

    public Locker() {
    }
}

class Auto extends Vehiculo {

    private boolean electrico; // si es false es gasolina

    public Auto(boolean electrico) {
        this.electrico = electrico;
    }

    public Auto(boolean electrico, double tarifa, String placa) {
        super(tarifa, placa);
        this.electrico = electrico;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    @Override
    public String toString() {
        return super.toString() + "Auto{" + "electrico=" + electrico + '}';
    }

}




class Vehiculo {

    private double tarifa;
    private String placa;
    private Persona persona;

    public Vehiculo() {
    }

    public Vehiculo(double tarifa, String placa) {
        this.tarifa = tarifa;
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "tarifa=" + tarifa + ", placa=" + placa + '}';
    }

    private static class Persona {

        public Persona() {
        }
    }

}
