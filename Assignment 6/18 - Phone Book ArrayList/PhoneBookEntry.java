public class PhoneBookEntry {

    // Fields that store the name and phonenumber
    private String name;
    private String phoneNumber;

    /* Constructor that creates a specified name and phoneNumber */
    public PhoneBookEntry(String s, String n) {
        name = s;
        phoneNumber = n;
    }

    /* Assesor Method to get the name */
    public String getName() {
        return name;
    }

    /* Mutator Method to set the name */
    public void setName(String s) {
        name = s;
    }

    /* Assesor Method to get the phone number */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /* Mutator Method to set the phone number */
    public void setPhoneNumber(String n) {
        phoneNumber = n;
    }

}