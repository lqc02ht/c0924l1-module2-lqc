package ss17_io_binary_file.product_management.model.service;

import ss17_io_binary_file.product_management.model.object.Product;
import ss17_io_binary_file.product_management.util.ReadAndWriteFile;

import java.util.List;

public class ProductService implements IProductService {
    private final String PRODUCT_FILE = "src/ss16_io_text_file/product_management/data/products.dat";

    @Override
    public List<Product> findAll() {
        return ReadAndWriteFile.readFile(PRODUCT_FILE);
    }

    @Override
    public void addProduct(Product product) {
        List<Product> productList = findAll();
        productList.add(product);
        ReadAndWriteFile.writeFile(PRODUCT_FILE, productList);
    }

    @Override
    public boolean deleteProductById(int id) {
        List<Product> productList = findAll();
        boolean isDeleted = productList.removeIf(product -> product.getId() == id);
        if (isDeleted) {
            ReadAndWriteFile.writeFile(PRODUCT_FILE, productList);
        }
        return isDeleted;
    }

    public boolean updateProduct(int id, Product updatedProduct) {
        List<Product> productList = findAll();
        boolean isUpdated = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.set(i, updatedProduct);
                isUpdated = true;
                break;
            }
        }
        if (isUpdated) {
            ReadAndWriteFile.writeFile(PRODUCT_FILE, productList);
        }
        return isUpdated;
    }
}
