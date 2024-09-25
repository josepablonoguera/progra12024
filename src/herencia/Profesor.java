package herencia;

public class Profesor extends Person {

    private String specialty;

    private String lenguage;

   

    public Profesor(String specialty, String lenguage,
            String id, String name, Contact contact) {
        super(id, name, contact);
        this.specialty = specialty;
        this.lenguage = lenguage;
    }

    /**
     * @return the specialty
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * @return the lenguage
     */
    public String getLenguage() {
        return lenguage;
    }

    /**
     * @param specialty the specialty to set
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * @param lenguage the lenguage to set
     */
    public void setLenguage(String lenguage) {
        this.lenguage = lenguage;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor{" + "specialty=" + specialty + ", lenguage=" + lenguage + '}';
    }

}
