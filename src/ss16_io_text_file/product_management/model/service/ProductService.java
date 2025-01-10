package ss16_io_text_file.product_management.model.service;

import ss16_io_text_file.product_management.model.object.Product;
import ss16_io_text_file.product_management.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {
    private final String PRODUCT_FILE = "src/ss16_io_text_file/product_management/data/products.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;

    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(PRODUCT_FILE);
        String[] part;
        for (int i = 0; i < stringList.size(); i++) {
            part = stringList.get(i).split(",");
            Product product = new Product(Integer.parseInt(part[0]), part[1], Double.parseDouble(part[2]), part[3]);
            productList.add(product);
        }
        return productList;
    }

    @Override
    public void addProduct(Product product) {
        List<String> stringList = new ArrayList<>();
        stringList.add(product.getInfoToFile());
        ReadAndWriteFile.writeFile(PRODUCT_FILE, stringList, APPEND);
    }

    @Override
    public boolean deleteProductById(int id) {
        List<Product> productList = findAll();
        boolean isDeleted = false;
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                isDeleted = true;
                productList.remove(i);
                break;
            }
        }
        if (isDeleted) {
            List<String> stringList = new ArrayList<>();
            for (Product product : productList) {
                stringList.add(product.getInfoToFile());
            }
            ReadAndWriteFile.writeFile(PRODUCT_FILE, stringList, NOT_APPEND);
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
            List<String> stringList = new ArrayList<>();
            for (Product product : productList) {
                stringList.add(product.getInfoToFile());
            }
            ReadAndWriteFile.writeFile(PRODUCT_FILE, stringList, NOT_APPEND);
        }
        return isUpdated;
    }
}
