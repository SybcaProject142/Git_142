package git_142;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        int number = 153;
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0, n = 0;
        originalNumber = number;

        // Store the number of digits of number
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        originalNumber = number;

        // Calculate sum of power of digits
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        // Check if number is Armstrong or not
        return result == number;
    }
}
