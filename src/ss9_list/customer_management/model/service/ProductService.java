package ss9_list.customer_management.model.service;

import ss9_list.customer_management.model.object.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements ICustomerService {
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Cuong1", "24/01/2002", "Viet Nam"));
        products.add(new Product(2, "Cuong2", "24/01/2002", "Viet Nam"));
        products.add(new Product(3, "Cuong3", "24/01/2002", "Viet Nam"));
        products.add(new Product(4, "Cuong4", "24/01/2002", "Viet Nam"));
        products.add(new Product(5, "Cuong5", "24/01/2002", "Viet Nam"));
        products.add(new Product(6, "Cuong6", "24/01/2002", "Viet Nam"));
        products.add(new Product(7, "Cuong7", "24/01/2002", "Viet Nam"));
        products.add(new Product(8, "Cuong8", "24/01/2002", "Viet Nam"));
        products.add(new Product(9, "Cuong9", "24/01/2002", "Viet Nam"));
        products.add(new Product(10, "Cuong10", "24/01/2002", "Viet Nam"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products); // Trả về một bản sao của danh sách để tránh thay đổi trực tiếp.
    }

    @Override
    public void addCustomer(Product product) {
        products.add(product);
    }

    @Override
    public boolean deleteProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
                return true;
            }
        }
        return false;
    }

    public boolean updateProduct(int id, Product updatedProduct) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.set(i, updatedProduct);
                return true;
            }
        }
        return false;
    }
}
