package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Palindrom Sayılar Testi:");
        System.out.println(isPalindrome(-541));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(12342));

        System.out.println("Mükemmel Sayılar Testi:");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(9));
        System.out.println(isPerfectNumber(-7));

        System.out.println("Sayıları Kelimelere Cevirme Testi");
        System.out.println(numberToWords(764));
        System.out.println(numberToWords(2042));
        System.out.println(numberToWords(34));
    }

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }

        int totalDivisors = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                totalDivisors += i;
            }
        }

        return totalDivisors == number;
    }

    public static String numberToWords(int num) {
        if (num < 0) {
            return "Invalid Value";
        }

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        StringBuilder result = new StringBuilder();
        String numStr = String.valueOf(num);

        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            result.append(words[digit]).append(" ");
        }

        return result.toString().trim();
    }
}