
public class Contact {

    private String name;
    private String phoneNumber;


    private Contact(String name, String phoneNumber) {

        this.name=name;
        this.phoneNumber=phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {

        return new Contact(name,phoneNumber);
    }
}









