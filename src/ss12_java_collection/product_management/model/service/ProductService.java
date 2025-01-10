package ss12_java_collection.product_management.model.service;

import ss12_java_collection.product_management.model.object.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {
    private final List<Product> productList = new ArrayList<>();

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productList);
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public boolean deleteProductById(int id) {
        return productList.removeIf(product -> product.getId() == id);
    }

    @Override
    public boolean updateProduct(int id, Product updatedProduct) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.set(i, updatedProduct);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> result = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(name)) {
                result.add(product);
            }
        }
        return result;
    }
}