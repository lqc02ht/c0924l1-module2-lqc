package final_exam.contact_management.view;

import final_exam.contact_management.controller.ContactController;

import java.util.Scanner;

public class MainView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactController contactController = new ContactController();
        while (true) {
            System.out.println("------------ CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ ------------");
            System.out.println("Chọn chức năng theo số (để tiếp tục):");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xoá");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Lưu vào file");
            System.out.println("8. Thoát");
            System.out.println("Chọn chức năng:");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        contactController.display();
                        break;
                    case 2:
                        contactController.add();
                        break;
                    case 3:
                        contactController.update();
                        break;
                    case 4:
                        contactController.delete();
                        break;
                    case 5:
                        contactController.search();
                        break;
                    case 6:
                        contactController.readFile();
                        break;
                    case 7:
                        contactController.writeFile();
                        break;
                    case 8:
                        System.exit(0);
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn phải nhập một số nguyên. Vui lòng thử lại!");
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
    }
}
