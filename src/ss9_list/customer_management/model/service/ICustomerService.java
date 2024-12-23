package ss9_list.customer_management.model.service;

import ss9_list.customer_management.model.object.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll(); // Trả về danh sách kiểu List thay vì mảng
    void addCustomer(Customer customer);
    boolean deleteCustomerById(int id);
    boolean updateCustomer(int id, Customer updatedCustomer); // Thêm phương thức update
}