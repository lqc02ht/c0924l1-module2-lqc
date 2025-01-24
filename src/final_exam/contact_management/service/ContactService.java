package final_exam.contact_management.service;

import case_study.vehicle_management.utils.FileHandler;
import final_exam.contact_management.model.Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ContactService implements IContactService {
    private final String CONTACT_FILE = "src/final_exam/contact_management/data/contacts.csv";

    public List<Contact> findAll() {
        List<Contact> contactList = new ArrayList<>();
        List<String> lines = FileHandler.readFile(CONTACT_FILE);
        for (String line : lines) {
            String[] parts = line.split(",");
            Contact contact = new Contact(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6]);
            contactList.add(contact);
        }
        return contactList;
    }

    public void displayContact() {
        List<Contact> contactList = findAll();
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        for (Contact contact : contactList) {
            System.out.println(contact);
            count++;
            if (count % 5 == 0) {
                System.out.println("Enter để hiển thị các danh bạ tiếp theo");
                scanner.nextLine();
            }
        }
    }

    public void addContact(Contact contact) {
        List<String> stringList = new ArrayList<>();
        stringList.add(contact.getInforToFile());
        FileHandler.writeFile(CONTACT_FILE, stringList, true);
    }

    public boolean updateContact(String phoneNumber) {
        List<Contact> contactList = findAll();
        while (true) {
            Contact contactToUpdate = null;

            for (Contact contact : contactList) {
                if (Objects.equals(phoneNumber, contact.getPhoneNumber())) {
                    contactToUpdate = contact;
                    break;
                }
            }

            if (contactToUpdate == null) {
                System.out.println("Không tìm được danh bạ với số điện thoại trên.");
                System.out.println("Nhập  lại số điện thoại:");
                phoneNumber = new Scanner(System.in).nextLine();
                if (phoneNumber.isEmpty()) {
                    return false;
                }
            } else {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhập nhóm mới của danh bạ");
                contactToUpdate.setGroupContact(scanner.nextLine());
                System.out.println("Nhập họ tên mới");
                contactToUpdate.setName(scanner.nextLine());
                System.out.println("Nhập giới tính mới");
                contactToUpdate.setGender(scanner.nextLine());
                System.out.println("Nhập địa chỉ mới:");
                contactToUpdate.setAddress(scanner.nextLine());
                System.out.println("Nhập ngày sinh mới:");
                contactToUpdate.setBirthdate(scanner.nextLine());
                System.out.println("Nhập email mới:");
                contactToUpdate.setEmail(scanner.nextLine());
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Contact contact : contactList) {
            stringList.add(contact.getInforToFile());
        }
        FileHandler.writeFile(CONTACT_FILE, stringList, false);
        System.out.println("Cập nhật thành công!");
        return true;
    }

    public boolean deleteContact(String phoneNumber) {
        List<Contact> contactList = findAll();
        boolean isDeleted = false;
        while (true) {
            boolean found = false;
            for (int i = 0; i < contactList.size(); i++) {
                if (Objects.equals(phoneNumber, contactList.get(i).getPhoneNumber())) {
                    found = true;
                    System.out.println("Bạn có muốn xoá số này khỏi danh bạ không?");
                    Scanner scanner = new Scanner(System.in);
                    String choice = scanner.nextLine().trim();
                    if (choice.equalsIgnoreCase("Y")) {
                        isDeleted = true;
                        contactList.remove(i);
                        break;
                    } else {
                        return false;
                    }
                }
            }
            if (!found) {
                System.out.println("Không tìm được danh bạ với số điện thoại trên.");
                System.out.println("Nhập  lại số điện thoại:");
                Scanner scanner = new Scanner(System.in);
                phoneNumber = scanner.nextLine().trim();
                if (phoneNumber.isEmpty()) {
                    return false;
                }
            } else {
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Contact contact : contactList) {
            stringList.add(contact.getInforToFile());
        }
        FileHandler.writeFile(CONTACT_FILE, stringList, false);
        return isDeleted;
    }

    public void searchContacts(String input) {
        List<Contact> contactList = findAll();
        List<Contact> matchingContacts = new ArrayList<>();
        for (Contact contact : contactList) {
            if (contact.getPhoneNumber().contains(input) || contact.getName().toLowerCase().contains(input.toLowerCase())) {
                matchingContacts.add(contact);
            }
        }
        if (matchingContacts.isEmpty()) {
            System.out.println("Không tìm thấy danh bạ nào khớp với thông tin: " + input);
        } else {
            System.out.println("Kết quả tìm kiếm:");
            for (Contact contact : matchingContacts) {
                System.out.println(contact);
            }
        }
    }

    public void readFromFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cảnh báo: Toàn bộ danh bạ trong bộ nhớ sẽ bị xóa.");
        System.out.println("Bạn có muốn tiếp tục không? (Y để xác nhận, nhấn phím khác để hủy):");
        String choice = scanner.nextLine().trim();
        if (!choice.equalsIgnoreCase("Y")) {
            System.out.println("Hủy thao tác. Quay lại Menu chính.");
            return;
        }
        List<String> lines = FileHandler.readFile(CONTACT_FILE);
        if (lines.isEmpty()) {
            System.out.println("File rỗng hoặc không có dữ liệu.");
            return;
        }
        List<Contact> contactList = new ArrayList<>();
        for (String line : lines) {
            String[] parts = line.split(",");
            Contact contact = new Contact(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6]);
            contactList.add(contact);
        }
        System.out.println("Cập nhật bộ nhớ từ file thành công! Danh bạ mới:");
        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }

    public void writeToFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cảnh báo: Toàn bộ nội dung danh bạ hiện tại sẽ bị ghi đè.");
        System.out.println("Bạn có muốn tiếp tục không? (Y để xác nhận, nhấn phím khác để hủy):");
        String choice = scanner.nextLine().trim();
        if (!choice.equalsIgnoreCase("Y")) {
            return;
        }
        List<Contact> contactList = findAll();
        if (contactList.isEmpty()) {
            System.out.println("Danh bạ hiện tại rỗng. Không có gì để lưu!");
            return;
        }
        List<String> stringList = new ArrayList<>();
        for (Contact contact : contactList) {
            stringList.add(contact.getInforToFile());
        }
        FileHandler.writeFile(CONTACT_FILE, stringList, false);
        System.out.println("Lưu danh bạ thành công!");
    }
}
