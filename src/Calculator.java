import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите формулу (Например 1 + 1): ");
        String input = scanner.nextLine();


        String[] parts = input.split(" ");


        if (parts.length != 3) {
            System.out.println("Формула должна состоять из двух чисел и одного знака.");
            return;
        }

        try {
            int num1 = Integer.parseInt(parts[0]);
            char operator = parts[1].charAt(0);
            int num2 = Integer.parseInt(parts[2]);


            if (num1 < 1 || num1 > 10 || num2 > 10) {
                System.out.println("Числа должны быть от 1 до 10");
                return;
            }

            int result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Делить на ноль нельзя (>_<)");
                        return;
                    }
                    break;
                default:
                    System.out.println("Неверный знак формулы (>_<)");
                    return;
            }

            System.out.println("Результат: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: оба операнда должны быть числами.");
        }
    }
}
