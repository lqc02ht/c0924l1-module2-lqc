package ss16_io_text_file.copy_file_text;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        String sourcePath = "src/ss16_io_text_file/copy_file_text/source/text.csv";
        String targetPath = "src/ss16_io_text_file/copy_file_text/target/text.csv";
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
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(targetFile))) {
            int charCount = 0;
            int charData;
            while ((charData = reader.read()) != -1) {
                writer.write(charData);
                charCount++;
            }
            System.out.println("Sao chép tệp thành công. Số ký tự trong tệp: " + charCount);
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi sao chép tệp: " + e.getMessage());
        }
    }
}
