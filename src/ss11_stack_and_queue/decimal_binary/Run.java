package ss11_stack_and_queue.decimal_binary;

import static ss11_stack_and_queue.decimal_binary.DecimalToBinary.decimalToBinary;

public class Run {
    public static void main(String[] args) {
        int decimalNumber = 30;
        String binaryResult = decimalToBinary(decimalNumber);

        System.out.println("Số thập phân: " + decimalNumber);
        System.out.println("Hệ nhị phân: " + binaryResult);
    }
}
