package ss17_io_binary_file.product_management.view;

import ss17_io_binary_file.product_management.controller.ProductController;

public class View {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.displayProductMenu();
    }
}
