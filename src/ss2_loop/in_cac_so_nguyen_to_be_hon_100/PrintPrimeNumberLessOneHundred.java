package ss2_loop.in_cac_so_nguyen_to_be_hon_100;

public class PrintPrimeNumberLessOneHundred {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố từ 2 đến 100: ");
        int N = 2;
        while (N <= 100) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(N + " ");
            }
            N++;
        }
    }
}
