package cicle;

import java.util.Scanner;

class InfiniteWhileLoop {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Это бесконечный цикл while!");
        }
    }
}

class InfiniteDoWhileLoop {
    public static void main(String[] args) {
        do {
            System.out.println("Это бесконечный цикл do-while!");
        } while (true);
    }
}

class ControlledInfiniteLoop {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите 'exit' для выхода из цикла:");
            // Чтение пользовательского ввода
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if ("exit".equalsIgnoreCase(input)) {
                break; // Выход из бесконечного цикла
            }
        }
        System.out.println("Цикл завершен.");
    }
}

class ContinueExample {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i % 2 == 0) {
                continue; // Пропуск текущей итерации для четных i
            }
            System.out.println("Нечетное значение i: " + i);
        }
        System.out.println("Цикл завершен.");
    }
}



