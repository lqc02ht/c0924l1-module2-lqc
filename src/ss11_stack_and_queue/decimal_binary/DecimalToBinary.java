package ss11_stack_and_queue.decimal_binary;

import java.util.Stack;

public class DecimalToBinary {
    public static String decimalToBinary(int decimal) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            stack.push(decimal % 2);
            decimal = decimal / 2;
        }

        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }
}
