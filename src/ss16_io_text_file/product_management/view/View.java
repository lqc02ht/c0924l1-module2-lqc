package ss16_io_text_file.product_management.view;

import ss16_io_text_file.product_management.controller.ProductController;

public class View {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.displayProductMenu();
    }
}
