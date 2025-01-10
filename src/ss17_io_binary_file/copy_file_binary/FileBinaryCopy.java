package ss17_io_binary_file.copy_file_binary;

import java.io.*;
import java.util.Scanner;

public class FileBinaryCopy {
    public static void main(String[] args) {
        String sourcePath = "src/ss17_io_binary_file/copy_file_binary/source/text.dat";
        String targetPath = "src/ss17_io_binary_file/copy_file_binary/target/text.dat";
        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);
        if (!sourceFile.exists()) {
            System.out.println("Tệp nguồn không tồn tại.");
            return;
        }
        if (targetFile.exists()) {
            System.out.println("Tệp đích đã tồn tại.");
            return;
        }
        try (FileInputStream inputStream = new FileInputStream(sourceFile);
             FileOutputStream outputStream = new FileOutputStream(targetFile)) {
            int byteCount = 0;
            int byteData;
            while ((byteData = inputStream.read()) != -1) {
                outputStream.write(byteData);
                byteCount++;
            }

            System.out.println("Sao chép tệp thành công. Số byte trong tệp: " + byteCount);

        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi sao chép tệp: " + e.getMessage());
        }
    }
}