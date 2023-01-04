import java.util.Scanner;

public class Calculator {
    float number1;
    float number2;

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
                System.exit(0);
            }
        }

    }

    private void printMenu() {
        System.out.println("Выберете операцию:\n1. Сложение(+).\n2. Вычетание(+).\n3. Умножение(*).\n4. Деление(/).\n5. Выход.");
    }

    public void addition() {
        enterTheNumber();
        float sum = number1 + number2;
        System.out.println("Сумма = " + sum);
        choice();
    }

    public void subtraction() {
        enterTheNumber();
        float difference = number1 - number2;
        System.out.println("Разность = " + difference);
        choice();

    }

    public void multiplication() {
        enterTheNumber();
        float product = number1 * number2;
        System.out.println("Произведение = " + product);
        choice();

    }

    public void division() {
        enterTheNumber();
        if (number2 != 0) {
            float quotient = number1 / number2;
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
        number1 = scanner.nextFloat();
        System.out.println("Введите число 2");
        number2 = scanner.nextFloat();
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