package herencia;

/**
 * The Classroom class represents a classroom entity with an identifier, name, and capacity.
 * This class provides constructors, getter and setter methods for each property, 
 * and a toString method for easy representation of a Classroom object.
 */
public class Classroom {

    private String idClassroom; // Unique identifier for the classroom
    private String nameClassroom; // Name of the classroom
    private int capacity; // Maximum number of students that the classroom can accommodate

    /**
     * Default constructor for the Classroom class.
     * Initializes a new Classroom object with default values.
     */
    public Classroom() {
    }

    /**
     * Parameterized constructor for the Classroom class.
     * Initializes a new Classroom object with specified values.
     * 
     * @param idClassroom   the unique identifier for the classroom
     * @param nameClassroom the name of the classroom
     * @param capacity      the maximum capacity of the classroom
     */
    public Classroom(String idClassroom, String nameClassroom, int capacity) {
        this.idClassroom = idClassroom;
        this.nameClassroom = nameClassroom;
        this.capacity = capacity;
    }

    /**
     * Gets the unique identifier of the classroom.
     * 
     * @return the idClassroom
     */
    public String getIdClassroom() {
        return idClassroom;
    }

    /**
     * Gets the name of the classroom.
     * 
     * @return the nameClassroom
     */
    public String getNameClassroom() {
        return nameClassroom;
    }

    /**
     * Gets the capacity of the classroom.
     * 
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets the unique identifier for the classroom.
     * 
     * @param idClassroom the idClassroom to set
     */
    public void setIdClassroom(String idClassroom) {
        this.idClassroom = idClassroom;
    }

    /**
     * Sets the name of the classroom.
     * 
     * @param nameClassroom the nameClassroom to set
     */
    public void setNameClassroom(String nameClassroom) {
        this.nameClassroom = nameClassroom;
    }

    /**
     * Sets the capacity of the classroom.
     * 
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Returns a string representation of the Classroom object.
     * 
     * @return a string in the format "Classroom{idClassroom=value, nameClassroom=value, capacity=value}"
     */
    @Override
    public String toString() {
        return "Classroom{" + "idClassroom=" + idClassroom + ", nameClassroom=" + nameClassroom + ", capacity=" + capacity + '}';
    }
}
