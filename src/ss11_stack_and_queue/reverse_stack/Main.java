package ss11_stack_and_queue.reverse_stack;

import java.util.Stack;

public class Main {

        public static void reverseArray(int[] arr) {
            Stack<Integer> stack = new Stack<>();
            for (int num : arr) {
                stack.push(num);
            }
            for (int i = 0; i < arr.length; i++) {
                arr[i] = stack.pop();
            }
        }

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};

            System.out.println("Mảng ban đầu:");
            for (int num : array) {
                System.out.print(num + " ");
            }
            reverseArray(array);
            System.out.println("\nMảng sau khi đảo ngược:");
            for (int num : array) {
                System.out.print(num + " ");
            }
        }
    }
