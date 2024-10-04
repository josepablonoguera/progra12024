/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package files;

/**
 *
 * @author ucr
 */
public class Voter implements Comparable<Voter> {

    private String cedula;
    private String codeElectoral;
    private String relleno;
    private String fechaCaducidad;
    private String junta;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;

    public Voter(String cedula, String codeElectoral, String relleno, 
            String fechaCaducidad, String junta, String nombre,
            String primerApellido, String segundoApellido) {
        this.cedula = cedula;
        this.codeElectoral = codeElectoral;
        this.relleno = relleno;
        this.fechaCaducidad = fechaCaducidad;
        this.junta = junta;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @return the codeElectoral
     */
    public String getCodeElectoral() {
        return codeElectoral;
    }

    /**
     * @return the relleno
     */
    public String getRelleno() {
        return relleno;
    }

    /**
     * @return the fechaCaducidad
     */
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     * @return the junta
     */
    public String getJunta() {
        return junta;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the primerApellido
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * @return the segundoApellido
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @param codeElectoral the codeElectoral to set
     */
    public void setCodeElectoral(String codeElectoral) {
        this.codeElectoral = codeElectoral;
    }

    /**
     * @param relleno the relleno to set
     */
    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    /**
     * @param fechaCaducidad the fechaCaducidad to set
     */
    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * @param junta the junta to set
     */
    public void setJunta(String junta) {
        this.junta = junta;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param primerApellido the primerApellido to set
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    /**
     * @param segundoApellido the segundoApellido to set
     */
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getFullName() {
        return this.nombre + " " + this.primerApellido + 
                " " + this.segundoApellido;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Voter{cedula=").append(cedula);
        sb.append(", codeElectoral=").append(codeElectoral);
        sb.append(", relleno=").append(relleno);
        sb.append(", fechaCaducidad=").append(fechaCaducidad);
        sb.append(", junta=").append(junta);
        sb.append(", nombre=").append(nombre);
        sb.append(", primerApellido=").append(primerApellido);
        sb.append(", segundoApellido=").append(segundoApellido);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Voter o) {
        return this.primerApellido.compareTo(o.primerApellido);

    }

}
