package ss8_mvc.customer_management.model.service;

import ss8_mvc.customer_management.model.object.Customer;

public class CustomerService implements ICustomerService {
    private static Customer[] customers = new Customer[10];
    static  {
        customers[0] = new Customer(1, "Cuong1", "24/01/2002", "Viet Nam");
        customers[1] = new Customer(2, "Cuong2", "24/01/2002", "Viet Nam");
        customers[2] = new Customer(3, "Cuong3", "24/01/2002", "Viet Nam");
        customers[3] = new Customer(4, "Cuong4", "24/01/2002", "Viet Nam");
        customers[4] = new Customer(5, "Cuong5", "24/01/2002", "Viet Nam");
        customers[5] = new Customer(6, "Cuong6", "24/01/2002", "Viet Nam");
        customers[6] = new Customer(7, "Cuong7", "24/01/2002", "Viet Nam");
        customers[7] = new Customer(8, "Cuong8", "24/01/2002", "Viet Nam");
        customers[8] = new Customer(9, "Cuong9", "24/01/2002", "Viet Nam");
        customers[9] = new Customer(10, "Cuong10", "24/01/2002", "Viet Nam");
    }

    @Override
    public Customer[] findAll() {
        return customers;
    }

    @Override
    public void addCustomer(Customer customer) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = customer;
                break;
            }
        }
    }

    @Override
    public boolean deleteCustomerById(int id) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null && customers[i].getId() == id) {
                customers[i] = null;
                return true;
            }
        }
        return false;
    }
}