package ss11_stack_and_queue.palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheck {

    public static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char ch : cleanedStr.toCharArray()) {
            queue.add(ch);
            stack.push(ch);
        }

        while (!queue.isEmpty()) {
            if (queue.poll() != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}