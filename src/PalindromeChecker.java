import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = scanner.nextLine();
        if (isPalindrome(string)) {
            System.out.println("Строка является палиндромом.");
        } else {
            System.out.println("Строка не является палиндромом.");
        }
    }

    public static boolean isPalindrome(String string) {
        // Удаляем все пробелы и приводим к нижнему регистру
        string = string.replaceAll("\\s+", "").toLowerCase();
        return string.equals(new StringBuilder(string).reverse().toString());
    }
}

//Для решения этой задачи можно использовать несколько подходов.
//
//Первый подход заключается в том, чтобы перевернуть строку и сравнить ее с исходной строкой. Для переворачивания строки можно использовать класс StringBuilder, который имеет метод reverse(). Затем можно использовать метод equals() для сравнения двух строк.
//
//Второй подход заключается в том, чтобы сравнивать символы с начала и конца строки. Для этого можно использовать цикл for, который будет проходить по половине строки и сравнивать символы с начала и конца строки. Если символы не совпадают, то строка не является палиндромом.
//
//В обоих подходах перед сравнением необходимо удалить все пробелы и привести строку к нижнему регистру, чтобы убедиться, что сравнение будет корректным.