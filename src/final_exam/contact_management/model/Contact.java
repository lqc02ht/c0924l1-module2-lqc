package final_exam.contact_management.model;

public class Contact {
    private String phoneNumber;
    private String groupContact;
    private String name;
    private String gender;
    private String address;
    private String birthdate;
    private String email;

    public Contact() {
    }

    public Contact(String phoneNumber, String groupContact, String name, String gender, String address, String birthdate, String email) {
        this.phoneNumber = phoneNumber;
        this.groupContact = groupContact;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.birthdate = birthdate;
        this.email = email;
    }

    public Contact(String phoneNumber, String groupContact, String name, String gender, String address) {
        this.phoneNumber = phoneNumber;
        this.groupContact = groupContact;
        this.name = name;
        this.gender = gender;
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroupContact() {
        return groupContact;
    }

    public void setGroupContact(String groupContact) {
        this.groupContact = groupContact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" + "phoneNumber='" + phoneNumber + '\'' + ", groupContact='" + groupContact + '\'' + ", name='" + name + '\'' + ", gender='" + gender + '\'' + ", address='" + address + '\'' + ", birthdate='" + birthdate + '\'' + ", email='" + email + '\'' + '}';
    }

    public String getInforToFile() {
        return phoneNumber + "," + groupContact + "," + name + "," + gender + "," + address + "," + birthdate + "," + email;
    }
}
