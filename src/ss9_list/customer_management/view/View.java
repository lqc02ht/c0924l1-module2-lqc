package ss9_list.customer_management.view;

import ss9_list.customer_management.controller.CustomerController;

public class View {
    public static void main(String[] args) {
        CustomerController productController = new CustomerController();
        productController.displayCustomerMenu();
    }
}
