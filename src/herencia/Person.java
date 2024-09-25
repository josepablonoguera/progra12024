package herencia;

/**
 * The Person class represents an individual with a unique identifier, name, and contact information.
 * This class provides constructors, getter and setter methods for each property, 
 * and a toString method for easy representation of a Person object.
 */
public class Person {

    private String id;      // Unique identifier for the person
    private String name;    // Name of the person
    private Contact contact; // Contact information of the person

    /**
     * Default constructor for the Person class.
     * Initializes a new Person object with default values.
     */
    public Person() {
    }

    /**
     * Parameterized constructor for the Person class.
     * Initializes a new Person object with specified values.
     * 
     * @param id      the unique identifier for the person
     * @param name    the name of the person
     * @param contact the contact information of the person
     */
    public Person(String id, String name, Contact contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    /**
     * Gets the unique identifier of the person.
     * 
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Gets the name of the person.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the contact information of the person.
     * 
     * @return the contact
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the unique identifier for the person.
     * 
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the name of the person.
     * 
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the contact information for the person.
     * 
     * @param contact the contact to set
     */
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    /**
     * Returns a string representation of the Person object.
     * 
     * @return a string in the format "Person{id='...', name='...', contact=...}"
     */
    @Override
    public String toString() {
        return "Person{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", contact=" + contact + '}';
    }
}
