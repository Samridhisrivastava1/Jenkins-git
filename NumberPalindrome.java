public class NumberPalindrome {
    public static void main(String[] args) {
        int number = 12321;
        
        if (isNumberPalindrome(number)) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }

    public static boolean isNumberPalindrome(int num) {
        // Negative numbers are not palindromes
        if (num < 0) return false;

        int originalNum = num;
        int reversedNum = 0;

        // Reverse the digits mathematically
        while (num != 0) {
            int remainder = num % 10;
            reversedNum = (reversedNum * 10) + remainder;
            num /= 10;
        }

        // Check if the reversed number matches the original
        return originalNum == reversedNum;
    }
}
