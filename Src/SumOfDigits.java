import java.util.Random;

public class SumOfDigits {
    public static void main(String[] args) {
        Random random = new Random();

        int number = random.nextInt(100001) + 10;

        System.out.println("Number generated: " + number);

        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.println("The sum of the digits of a number: " + sum);
    }
}