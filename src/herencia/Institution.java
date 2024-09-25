package herencia;
/**
 * The Institution class represents an educational institution with a name.
 * This class provides constructors, getter and setter methods for the institution's name,
 * and a toString method for easy representation of an Institution object.
 */
public class Institution {

    private String nameInstitution; // Name of the institution

    /**
     * Default constructor for the Institution class.
     * Initializes a new Institution object with default values.
     */
    public Institution() {
    }

    /**
     * Parameterized constructor for the Institution class.
     * Initializes a new Institution object with the specified name.
     * 
     * @param nameInstitution the name of the institution
     */
    public Institution(String nameInstitution) {
        this.nameInstitution = nameInstitution;
    }

    /**
     * Gets the name of the institution.
     * 
     * @return the nameInstitution
     */
    public String getNameInstitution() {
        return nameInstitution;
    }

    /**
     * Sets the name of the institution.
     * 
     * @param nameInstitution the nameInstitution to set
     */
    public void setNameInstitution(String nameInstitution) {
        this.nameInstitution = nameInstitution;
    }

    /**
     * Returns a string representation of the Institution object.
     * 
     * @return a string in the format "Institution{nameInstitution='...'}"
     */
    @Override
    public String toString() {
        return "Institution{" + "nameInstitution='" + nameInstitution + '\'' + '}';
    }
}
