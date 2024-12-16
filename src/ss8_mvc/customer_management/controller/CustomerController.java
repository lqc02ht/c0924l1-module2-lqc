package ss8_mvc.customer_management.controller;

import ss8_mvc.customer_management.model.object.Customer;
import ss8_mvc.customer_management.model.service.CustomerService;

import java.util.Scanner;

public class CustomerController {
    private CustomerService customerService = new CustomerService();
    public void displayCustomerMenu() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Chọn chức năng\n"
                    + "1. Xem danh sách\n"
                    + "2. Thêm mới\n"
                    + "3 Xoá\n"
                    + "4 Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("----------xem danh sách----------");
                    Customer[] customers = customerService.findAll();
                    for (Customer customer:customers) {
                        if (customer != null) {
                            System.out.println(customer);
                        }
                    }
                    break;
                case 2:
                    System.out.println("----------thêm mới----------");
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
                    System.out.println("----------xoá----------");
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
                    System.out.println("----------kết thúc----------");
                    System.exit(0);
                    break;
            }
        }
    }
}
