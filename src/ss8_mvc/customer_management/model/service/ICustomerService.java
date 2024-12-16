package ss8_mvc.customer_management.model.service;

import ss8_mvc.customer_management.model.object.Customer;

public interface ICustomerService {
    Customer[] findAll();
    void addCustomer(Customer customer);
    boolean deleteCustomerById(int id);
}
