package ss17_io_binary_file.product_management.util;

import ss17_io_binary_file.product_management.model.object.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void writeFile(String filePath, List<Product> stringList) {
        File file = new File(filePath);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(stringList);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }finally {
            try {
                assert objectOutputStream != null;
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                System.out.println("Lỗi đóng file");
            }
        }
    }

    public static List<Product> readFile(String filePath) {
        List<Product> productList = new ArrayList<>();
        File file = new File(filePath);
        FileInputStream fileInputStream =null;
        ObjectInputStream objectInputStream = null;
        try {
            if (file.length()>0){
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                productList = (List<Product>) objectInputStream.readObject();
            }
        } catch (FileNotFoundException e) {
            System.out.println("lỗi không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return productList;
    }
}
