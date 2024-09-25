package herencia;

/**
 * The Course class represents an educational course with various attributes such as
 * identifier, name, capacity, modality, schedule, classroom, instructor (professor), and price.
 * This class provides constructors, getter and setter methods for each property, 
 * and a toString method for easy representation of a Course object.
 */
public class Course {

    private double price;        // Price of the course
    
    private int capacity;        // Maximum number of students that the course can accommodate
    
    private Classroom classroom; // Classroom where the course is conducted
    
    private Profesor profesor;   // Professor teaching the course
   
    private Schedule schedule;   // Schedule associated with the course
    
    private String idCourse;    // Unique identifier for the course
    private String modality;     // Modality of the course (e.g., online, in-person)
    private String nameCourse;   // Name of the course
   

    /**
     * Default constructor for the Course class.
     * Initializes a new Course object with default values.
     */
    public Course() {
    }

    /**
     * Parameterized constructor for the Course class.
     * Initializes a new Course object with specified values.
     * 
     * @param idCourse    the unique identifier for the course
     * @param nameCourse  the name of the course
     * @param capacity    the maximum capacity of the course
     * @param modality    the modality of the course (e.g., online, in-person)
     * @param schedule    the schedule for the course
     * @param classroom   the classroom where the course is held
     * @param profesor    the professor teaching the course
     * @param price       the price of the course
     */
    public Course(String idCourse, String nameCourse, int capacity, String modality, Schedule schedule, Classroom classroom, Profesor profesor, double price) {
        this.idCourse = idCourse;
        this.nameCourse = nameCourse;
        this.capacity = capacity;
        this.modality = modality;
        this.schedule = schedule;
        this.classroom = classroom;
        this.profesor = profesor;
        this.price = price;
    }

    /**
     * Gets the unique identifier of the course.
     * 
     * @return the idCourse
     */
    public String getIdCourse() {
        return idCourse;
    }

    /**
     * Gets the name of the course.
     * 
     * @return the nameCourse
     */
    public String getNameCourse() {
        return nameCourse;
    }

    /**
     * Gets the maximum capacity of the course.
     * 
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Gets the modality of the course.
     * 
     * @return the modality
     */
    public String getModality() {
        return modality;
    }

    /**
     * Gets the schedule associated with the course.
     * 
     * @return the schedule
     */
    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * Gets the classroom where the course is conducted.
     * 
     * @return the classroom
     */
    public Classroom getClassroom() {
        return classroom;
    }

    /**
     * Gets the professor teaching the course.
     * 
     * @return the profesor
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * Gets the price of the course.
     * 
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the unique identifier for the course.
     * 
     * @param idCourse the idCourse to set
     */
    public void setIdCourse(String idCourse) {
        this.idCourse = idCourse;
    }

    /**
     * Sets the name of the course.
     * 
     * @param nameCourse the nameCourse to set
     */
    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    /**
     * Sets the maximum capacity for the course.
     * 
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Sets the modality of the course.
     * 
     * @param modality the modality to set
     */
    public void setModality(String modality) {
        this.modality = modality;
    }

    /**
     * Sets the schedule for the course.
     * 
     * @param schedule the schedule to set
     */
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    /**
     * Sets the classroom for the course.
     * 
     * @param classroom the classroom to set
     */
    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    /**
     * Sets the professor for the course.
     * 
     * @param profesor the profesor to set
     */
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    /**
     * Sets the price for the course.
     * 
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Returns a string representation of the Course object.
     * 
     * @return a string in the format "Course{idCourse=value, nameCourse=value, capacity=value, modality=value, schedule=value, classroom=value, profesor=value, price=value}"
     */
    @Override
    public String toString() {
        return "Course{" + "idCourse=" + idCourse + ", nameCourse=" + nameCourse + 
               ", capacity=" + capacity + ", modality=" + modality + 
               ", schedule=" + schedule + ", classroom=" + classroom + 
               ", profesor=" + profesor + ", price=" + price + '}';
    }
}
