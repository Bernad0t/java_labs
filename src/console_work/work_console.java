package console_work;

import java.util.Scanner;

public class work_console {
    public static void main(String[] args) {
        System.out.println("Введите имя");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Привет, " + name);
    }
}
