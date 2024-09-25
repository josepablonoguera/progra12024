package herencia;

/**
 * The Contact class represents a contact entity with multiple emails, phone numbers, and an address.
 * This class provides constructors, getter and setter methods for each property, 
 * and a toString method for easy representation of a Contact object.
 */
public class Contact {

    private String[] emails; // Array of email addresses associated with the contact
    private String[] phones; // Array of phone numbers associated with the contact
    private String address; // Physical address of the contact

    /**
     * Default constructor for the Contact class.
     * Initializes a new Contact object with default values.
     */
    public Contact() {
    }

    /**
     * Parameterized constructor for the Contact class.
     * Initializes a new Contact object with specified values.
     * 
     * @param emails  an array of email addresses for the contact
     * @param phones  an array of phone numbers for the contact
     * @param address the physical address of the contact
     */
    public Contact(String[] emails, String[] phones, String address) {
        this.emails = emails;
        this.phones = phones;
        this.address = address;
    }

    /**
     * Gets the array of email addresses associated with the contact.
     * 
     * @return the emails
     */
    public String[] getEmails() {
        return emails;
    }

    /**
     * Gets the array of phone numbers associated with the contact.
     * 
     * @return the phones
     */
    public String[] getPhones() {
        return phones;
    }

    /**
     * Gets the physical address of the contact.
     * 
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the array of email addresses for the contact.
     * 
     * @param emails the emails to set
     */
    public void setEmails(String[] emails) {
        this.emails = emails;
    }

    /**
     * Sets the array of phone numbers for the contact.
     * 
     * @param phones the phones to set
     */
    public void setPhones(String[] phones) {
        this.phones = phones;
    }

    /**
     * Sets the physical address for the contact.
     * 
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns a string representation of the Contact object.
     * 
     * @return a string in the format "Contact{emails=[...], phones=[...], address='...'}"
     */
    @Override
    public String toString() {
        return "Contact{" + "emails=" + java.util.Arrays.toString(emails) + 
               ", phones=" + java.util.Arrays.toString(phones) + 
               ", address='" + address + '\'' + '}';
    }
}
