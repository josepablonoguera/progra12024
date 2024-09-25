package herencia;

/**
 * The Schedule class represents a schedule entry, including the day, start and end hours,
 * and a unique identifier for the schedule. This class provides constructors,
 * getter and setter methods for each property, and a toString method for easy representation
 * of a Schedule object.
 */
public class Schedule {

    private String day;        // The day of the week for the schedule
    private String beginHour;  // The starting hour of the schedule
    private String endHour;    // The ending hour of the schedule
    private String idSchedule;  // Unique identifier for the schedule

    /**
     * Default constructor for the Schedule class.
     * Initializes a new Schedule object with default values.
     */
    public Schedule() {
    }

    /**
     * Parameterized constructor for the Schedule class.
     * Initializes a new Schedule object with specified values.
     * 
     * @param day        the day of the schedule
     * @param beginHour  the starting hour of the schedule
     * @param endHour    the ending hour of the schedule
     * @param idSchedule the unique identifier for the schedule
     */
    public Schedule(String day, String beginHour, String endHour, String idSchedule) {
        this.day = day;
        this.beginHour = beginHour;
        this.endHour = endHour;
        this.idSchedule = idSchedule;
    }

    /**
     * Gets the day of the schedule.
     * 
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * Gets the starting hour of the schedule.
     * 
     * @return the beginHour
     */
    public String getBeginHour() {
        return beginHour;
    }

    /**
     * Gets the ending hour of the schedule.
     * 
     * @return the endHour
     */
    public String getEndHour() {
        return endHour;
    }

    /**
     * Gets the unique identifier of the schedule.
     * 
     * @return the idSchedule
     */
    public String getIdSchedule() {
        return idSchedule;
    }

    /**
     * Sets the day of the schedule.
     * 
     * @param day the day to set
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * Sets the starting hour of the schedule.
     * 
     * @param beginHour the beginHour to set
     */
    public void setBeginHour(String beginHour) {
        this.beginHour = beginHour;
    }

    /**
     * Sets the ending hour of the schedule.
     * 
     * @param endHour the endHour to set
     */
    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }

    /**
     * Sets the unique identifier for the schedule.
     * 
     * @param idSchedule the idSchedule to set
     */
    public void setIdSchedule(String idSchedule) {
        this.idSchedule = idSchedule;
    }

    /**
     * Returns a string representation of the Schedule object.
     * 
     * @return a string in the format "Schedule{day='...', beginHour='...', endHour='...', idSchedule='...'}"
     */
    @Override
    public String toString() {
        return "Schedule{" + "day='" + day + '\'' + ", beginHour='" + beginHour + '\'' + 
               ", endHour='" + endHour + '\'' + ", idSchedule='" + idSchedule + '\'' + '}';
    }
}
