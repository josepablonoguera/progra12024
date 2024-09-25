package herencia;

public class Student extends Person {

    private int rangeAge;

    private String scholarity;

    public Student(int rangeAge, String scholarity, 
            String id, String name, Contact contact) {
        super(id, name, contact);
        this.rangeAge = rangeAge;
        this.scholarity = scholarity;
    }

    /**
     * @return the rangeAge
     */
    public int getRangeAge() {
        return rangeAge;
    }

    /**
     * @return the scholarity
     */
    public String getScholarity() {
        return scholarity;
    }

    /**
     * @param rangeAge the rangeAge to set
     */
    public void setRangeAge(int rangeAge) {
        this.rangeAge = rangeAge;
    }

    /**
     * @param scholarity the scholarity to set
     */
    public void setScholarity(String scholarity) {
        this.scholarity = scholarity;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" + "rangeAge=" + rangeAge + ", scholarity=" + scholarity + '}';
    }
    
    
    
}
