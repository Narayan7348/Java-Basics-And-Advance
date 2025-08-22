public class PrimeNumberRange {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100 are:");

        for (int num = 1; num <= 100; num++) {
            int count = 0;

            // count divisors of num
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            // prime has exactly 2 divisors
            if (count == 2) {
                System.out.print(num + " ");
            }// not a prime number
            }
        }
    }

