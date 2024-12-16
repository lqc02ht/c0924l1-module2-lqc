package ss8_mvc.customer_management.view;

import ss8_mvc.customer_management.controller.CustomerController;
import ss8_mvc.customer_management.model.service.CustomerService;

public class View {
    public static void main(String[] args) {
        CustomerController customerController = new CustomerController();
        customerController.displayCustomerMenu();
    }
}
