package ss17_io_binary_file.product_management.model.service;

import ss17_io_binary_file.product_management.model.object.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void addProduct(Product product);
    boolean deleteProductById(int id);
    boolean updateProduct(int id, Product updatedProduct);
}