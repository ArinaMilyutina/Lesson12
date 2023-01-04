import java.util.Scanner;

public class Calculator {
    int number1;
    int number2;

    public void run() {
        while (true) {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            int choice1 = scanner.nextInt();
            if (choice1 == 1) {
                addition();
            } else if (choice1 == 2) {
                subtraction();

            } else if (choice1 == 3) {
                multiplication();

            } else if (choice1 == 4) {
                division();
            } else if (choice1 == 5) {
                return;
            }
        }

    }

    private void printMenu() {
        System.out.println("Выберете операцию:");
        System.out.println("1. Сложение(+).");
        System.out.println("2. Вычетание(-).");
        System.out.println("3. Умножение(*).");
        System.out.println("4. Деление(/).");
        System.out.println("5. Выход.");
    }

    public void addition() {
        enterTheNumber();
        int sum = number1 + number2;
        System.out.println("Сумма = " + sum);
        choice();
    }

    public void subtraction() {
        enterTheNumber();
        int difference = number1 - number2;
        System.out.println("Разность = " + difference);
        choice();

    }

    public void multiplication() {
        enterTheNumber();
        int product = number1 * number2;
        System.out.println("Произведение = " + product);
        choice();

    }

    public void division() {
        enterTheNumber();
        if (number2 != 0) {
            int quotient = number1 / number2;
            System.out.println("Частное = " + quotient);
            choice();
        } else {
            System.out.println("Ошибка! На 0 делить нельзя, повторите ввод.");
            enterTheNumber();
        }
    }

    public void enterTheNumber() {
        System.out.println("Введите число 1");
        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextInt();
        System.out.println("Введите число 2");
        number2 = scanner.nextInt();
    }

    public void choice() {
        while (true) {
            System.out.println("Желаете продолжить?(Да/Нет)");
            Scanner scanner = new Scanner(System.in);
            String choice2 = scanner.nextLine();
            if (choice2.equals("Да")) {
                run();
            } else if (choice2.equals("Нет")) {
                System.exit(0);
            }

        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.run();
    }
}