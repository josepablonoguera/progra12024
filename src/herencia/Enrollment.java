package herencia;

/**
 * The Enrollment class represents an enrollment entity that manages a collection of students,
 * courses, and the institution they are enrolled in. This class provides constructors,
 * getter and setter methods for each property, and a toString method for easy representation
 * of an Enrollment object.
 */
public class Enrollment {

    private Student[] students;  // Array of students enrolled in the courses
    private Course[] courses;     // Array of courses in which the students are enrolled
    private Institution institution; // Institution associated with the enrollment

    /**
     * Default constructor for the Enrollment class.
     * Initializes a new Enrollment object with default values.
     */
    public Enrollment() {
    }

    /**
     * Parameterized constructor for the Enrollment class.
     * Initializes a new Enrollment object with specified values.
     * 
     * @param students    an array of students enrolled
     * @param courses     an array of courses in which the students are enrolled
     * @param institution the institution associated with the enrollment
     */
    public Enrollment(Student[] students, Course[] courses, Institution institution) {
        this.students = students;
        this.courses = courses;
        this.institution = institution;
    }

    /**
     * Gets the array of students enrolled.
     * 
     * @return the students
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * Gets the array of courses in which the students are enrolled.
     * 
     * @return the courses
     */
    public Course[] getCourses() {
        return courses;
    }

    /**
     * Gets the institution associated with the enrollment.
     * 
     * @return the institution
     */
    public Institution getInstitution() {
        return institution;
    }

    /**
     * Sets the array of students for the enrollment.
     * 
     * @param students the students to set
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     * Sets the array of courses for the enrollment.
     * 
     * @param courses the courses to set
     */
    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    /**
     * Sets the institution for the enrollment.
     * 
     * @param institution the institution to set
     */
    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    /**
     * Returns a string representation of the Enrollment object.
     * 
     * @return a string in the format "Enrollment{students=[...], courses=[...], institution=...}"
     */
    @Override
    public String toString() {
        return "Enrollment{" + "students=" + java.util.Arrays.toString(students) + 
               ", courses=" + java.util.Arrays.toString(courses) + 
               ", institution=" + institution + '}';
    }
}
