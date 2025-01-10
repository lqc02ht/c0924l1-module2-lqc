package ss17_io_binary_file.product_management.model.service;

import ss17_io_binary_file.product_management.model.object.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll(); // Trả về danh sách kiểu List thay vì mảng
    void addProduct(Product product);
    boolean deleteProductById(int id);
    boolean updateProduct(int id, Product updatedProduct); // Thêm phương thức update
}