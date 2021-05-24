package com.company;

// Программа, которая находит и выводит все простые числа меньше 100
public class Primes
{
    public static void main(String[] args) // основной метод
    {
        for (int i = 2; i <= 100; i++)
            if (isPrime(i))
                System.out.print(i + "\t");
    }
    public static boolean isPrime(int n) // функция определяет, является ли аргумент простым числом
    {
        for (int i = 2; i < n; i++)
            if (n % i == 0) return false;
        return true;
    }
}