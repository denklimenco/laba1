package com.company;

// Программа, показывающая, является строка палиндромом
public class Palindrome
{
    public static void main(String[] args) { // Основной метод
        System.out.println("Palindrome: ");
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(s + " - " + isPalindrome(s));
        }
    }
    public static String reverseString(String s) { // Метод, позволяющий полностью изменить символы в строке
        String a = "";
        for (int i = 0; i < s.length(); i++) {
            a += s.charAt(s.length() - 1 - i);
        }
        return a;
    }
    public static boolean isPalindrome(String s) { // Метод переворачивает слово, а затем сравнивает с первоначальными данными
        return s.equals(reverseString(s));
    }
}
