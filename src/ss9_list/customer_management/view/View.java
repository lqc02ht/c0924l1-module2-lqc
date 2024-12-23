package ss9_list.customer_management.view;

import ss9_list.customer_management.controller.CustomerController;
import ss9_list.customer_management.model.service.CustomerService;

public class View {
    public static void main(String[] args) {
        CustomerController customerController = new CustomerController();
        customerController.displayCustomerMenu();
    }
}
