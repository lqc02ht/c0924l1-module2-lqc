package final_exam.contact_management.service;

import final_exam.contact_management.model.Contact;

import java.util.List;

public interface IContactService {
    void displayContact();

    void addContact(Contact contact);

    boolean updateContact(String phoneNumber);

    boolean deleteContact(String phoneNumber);

    void searchContacts(String input);

    void readFromFile();

    void writeToFile();
}
