package ss11_stack_and_queue.palindrome;

import static ss11_stack_and_queue.palindrome.PalindromeCheck.isPalindrome;

public class Run {
    public static void main(String[] args) {
        String input = "Able was I ere I saw Elba";

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" là chuỗi Palindrome.");
        } else {
            System.out.println("\"" + input + "\" không phải là chuỗi Palindrome.");
        }
    }
}
