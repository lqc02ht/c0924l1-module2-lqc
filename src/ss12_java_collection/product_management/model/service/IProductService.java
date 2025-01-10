package ss12_java_collection.product_management.model.service;

import ss12_java_collection.product_management.model.object.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void addProduct(Product product);
    boolean deleteProductById(int id);
    boolean updateProduct(int id, Product updatedProduct);
    List<Product> findByName(String name);
}