package ss9_list.customer_management.model.service;

import ss9_list.customer_management.model.object.Product;

import java.util.List;

public interface ICustomerService {
    List<Product> findAll(); // Trả về danh sách kiểu List thay vì mảng
    void addCustomer(Product product);
    boolean deleteProductById(int id);
    boolean updateProduct(int id, Product updatedProduct); // Thêm phương thức update
}