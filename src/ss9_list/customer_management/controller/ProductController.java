package ss9_list.customer_management.controller;

import ss9_list.customer_management.model.object.Product;
import ss9_list.customer_management.model.service.ProductService;

import java.util.List;
import java.util.Scanner;

public class ProductController {
    private ProductService productService = new ProductService();

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
                    List<Product> products = productService.findAll();
                    for (Product product : products) {
                        System.out.println(product);
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
                    Product product = new Product(id, name, birthDate, address);
                    productService.addCustomer(product);
                    break;
                case 3:
                    System.out.println("---------- Xoá ----------");
                    System.out.println("Nhập id khách hàng cần xoá: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    boolean isDeleted = productService.deleteProductById(deleteId);
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
                    Product updatedProduct = new Product(updateId, newName, newBirthDate, newAddress);
                    boolean isUpdated = productService.updateProduct(updateId, updatedProduct);
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