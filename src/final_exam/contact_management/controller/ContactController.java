package final_exam.contact_management.controller;

import final_exam.contact_management.model.Contact;
import final_exam.contact_management.service.ContactService;

import java.util.Scanner;

public class ContactController {
    ContactService contactService = new ContactService();
    Scanner scanner = new Scanner(System.in);
    String phoneNumber;

    public void display() {
        contactService.displayContact();
    }

    public void add() {
        System.out.println("Nhập số điện thoại bạn muốn thêm:");
        phoneNumber = scanner.nextLine();
        System.out.println("Nhập nhóm của danh bạ:");
        String groupContact = scanner.nextLine();
        System.out.println("Nhập họ và tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập giới tính:");
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ:");
        String address = scanner.nextLine();
        System.out.println("Nhập ngày sinh:");
        String birthdate = scanner.nextLine();
        System.out.println("Nhập Email:");
        String email = scanner.nextLine();
        contactService.addContact(new Contact(phoneNumber, groupContact, name, gender, address, birthdate, email));
    }

    public void update() {
        do {
            System.out.println("Nhập số điện thoại bạn muốn sửa:");
            phoneNumber = scanner.nextLine();
            if (phoneNumber.isEmpty()) {
                return;
            }
        } while (!contactService.updateContact(phoneNumber));
    }

    public void delete() {
        do {
            System.out.println("Nhập số điện thoại bạn muốn xoá:");
            phoneNumber = scanner.nextLine();
            if (phoneNumber.isEmpty()) {
                return;
            }

        } while (!contactService.deleteContact(phoneNumber));
    }

    public void search() {
        System.out.println("Nhập thông tin cần tìm kiếm (Số điện thoại hoặc họ và tên):");
        String input = scanner.nextLine().trim();
        if (input.isEmpty()) {
            return;
        }
        contactService.searchContacts(input);
    }

    public void readFile() {
        contactService.readFromFile();
    }

    public void writeFile() {
        contactService.writeToFile();
    }
}
