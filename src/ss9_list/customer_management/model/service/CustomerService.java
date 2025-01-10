package ss9_list.customer_management.model.service;

import ss9_list.customer_management.model.object.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService {
    private static List<Customer> customers = new ArrayList<>();

    static {
        customers.add(new Customer(1, "Cuong1", "24/01/2002", "Viet Nam"));
        customers.add(new Customer(2, "Cuong2", "24/01/2002", "Viet Nam"));
        customers.add(new Customer(3, "Cuong3", "24/01/2002", "Viet Nam"));
        customers.add(new Customer(4, "Cuong4", "24/01/2002", "Viet Nam"));
        customers.add(new Customer(5, "Cuong5", "24/01/2002", "Viet Nam"));
        customers.add(new Customer(6, "Cuong6", "24/01/2002", "Viet Nam"));
        customers.add(new Customer(7, "Cuong7", "24/01/2002", "Viet Nam"));
        customers.add(new Customer(8, "Cuong8", "24/01/2002", "Viet Nam"));
        customers.add(new Customer(9, "Cuong9", "24/01/2002", "Viet Nam"));
        customers.add(new Customer(10, "Cuong10", "24/01/2002", "Viet Nam"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers); // Trả về một bản sao của danh sách để tránh thay đổi trực tiếp.
    }

    @Override
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public boolean deleteCustomerById(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                customers.remove(customer);
                return true;
            }
        }
        return false;
    }

    public boolean updateCustomer(int id, Customer updatedCustomer) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == id) {
                customers.set(i, updatedCustomer);
                return true;
            }
        }
        return false;
    }
}
