package ss12_java_collection.product_management.view;

import ss12_java_collection.product_management.controller.ProductController;

public class View {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.displayProductMenu();
    }
}
