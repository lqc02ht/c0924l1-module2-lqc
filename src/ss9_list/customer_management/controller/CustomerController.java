package ss9_list.customer_management.controller;

import ss9_list.customer_management.model.object.Customer;
import ss9_list.customer_management.model.service.CustomerService;

import java.util.List;
import java.util.Scanner;

public class CustomerController {
    private CustomerService customerService = new CustomerService();

    public void displayCustomerMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Chọn chức năng\n"
                    + "1. Xem danh sách\n"
                    + "2. Thêm mới\n"
                    + "3. Xoá\n"
                    + "4. Cập nhật\n"
                    + "5. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("---------- Xem danh sách ----------");
                    List<Customer> customers = customerService.findAll();
                    for (Customer customer : customers) {
                        System.out.println(customer);
                    }
                    break;
                case 2:
                    System.out.println("---------- Thêm mới ----------");
                    System.out.println("Nhập id:");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập name:");
                    String name = scanner.nextLine();
                    System.out.println("Nhập birthDate:");
                    String birthDate = scanner.nextLine();
                    System.out.println("Nhập address:");
                    String address = scanner.nextLine();
                    Customer customer = new Customer(id, name, birthDate, address);
                    customerService.addCustomer(customer);
                    break;
                case 3:
                    System.out.println("---------- Xoá ----------");
                    System.out.println("Nhập id khách hàng cần xoá: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    boolean isDeleted = customerService.deleteCustomerById(deleteId);
                    if (isDeleted) {
                        System.out.println("Xoá khách hàng thành công!");
                    } else {
                        System.out.println("Không tìm thấy khách hàng với id: " + deleteId);
                    }
                    break;
                case 4:
                    System.out.println("---------- Cập nhật ----------");
                    System.out.println("Nhập id khách hàng cần cập nhật: ");
                    int updateId = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập name mới:");
                    String newName = scanner.nextLine();
                    System.out.println("Nhập birthDate mới:");
                    String newBirthDate = scanner.nextLine();
                    System.out.println("Nhập address mới:");
                    String newAddress = scanner.nextLine();
                    Customer updatedCustomer = new Customer(updateId, newName, newBirthDate, newAddress);
                    boolean isUpdated = customerService.updateCustomer(updateId, updatedCustomer);
                    if (isUpdated) {
                        System.out.println("Cập nhật khách hàng thành công!");
                    } else {
                        System.out.println("Không tìm thấy khách hàng với id: " + updateId);
                    }
                    break;
                case 5:
                    System.out.println("---------- Kết thúc ----------");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
            }
        }
    }
}