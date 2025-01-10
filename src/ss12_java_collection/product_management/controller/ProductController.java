package ss12_java_collection.product_management.controller;

import ss12_java_collection.product_management.model.object.Product;
import ss12_java_collection.product_management.model.service.ProductService;

import java.util.List;
import java.util.Scanner;

public class ProductController {
    private ProductService productService = new ProductService();

    public void displayProductMenu() {
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
                    System.out.println("Nhập price:");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.println("Nhập address:");
                    String address = scanner.nextLine();
                    Product product = new Product(id, name, price, address);
                    productService.addProduct(product);
                    break;
                case 3:
                    System.out.println("---------- Xoá ----------");
                    System.out.println("Nhập id sản phẩm cần xoá: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    boolean isDeleted = productService.deleteProductById(deleteId);
                    if (isDeleted) {
                        System.out.println("Xoá sản phẩm thành công!");
                    } else {
                        System.out.println("Không tìm thấy sản phẩm với id: " + deleteId);
                    }
                    break;
                case 4:
                    System.out.println("---------- Cập nhật ----------");
                    System.out.println("Nhập id sản phẩm cần cập nhật: ");
                    int updateId = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập name mới:");
                    String newName = scanner.nextLine();
                    System.out.println("Nhập price mới:");
                    double newPrice = Double.parseDouble(scanner.nextLine());
                    System.out.println("Nhập address mới:");
                    String newAddress = scanner.nextLine();
                    Product updatedProduct = new Product(updateId, newName, newPrice, newAddress);
                    boolean isUpdated = productService.updateProduct(updateId, updatedProduct);
                    if (isUpdated) {
                        System.out.println("Cập nhật sản phẩm thành công!");
                    } else {
                        System.out.println("Không tìm thấy sản phẩm với id: " + updateId);
                    }
                    break;
                case 5:
                    System.out.println("---------- Tìm kiếm sản phẩm theo tên ----------");
                    System.out.println("Nhập tên sản phẩm cần tìm: ");
                    String searchName = scanner.nextLine();
                    List<Product> foundProducts = productService.findByName(searchName);
                    if (foundProducts.isEmpty()) {
                        System.out.println("Không tìm thấy sản phẩm nào.");
                    } else {
                        for (Product p : foundProducts) {
                            System.out.println(p);
                        }
                    }
                    break;
                case 6:
                    System.out.println("---------- Kết thúc ----------");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
            }
        }
    }
}