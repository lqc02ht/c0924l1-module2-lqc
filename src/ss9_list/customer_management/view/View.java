package ss9_list.customer_management.view;

import ss9_list.customer_management.controller.ProductController;

public class View {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.displayCustomerMenu();
    }
}
