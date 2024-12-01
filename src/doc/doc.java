package doc;

/**
 * Этот класс представляет простую математическую операцию.
 */
public class doc {

    /**
     * Суммирует два целых числа.
     *
     * @param a первое число
     * @param b второе число
     * @return сумма чисел a и b
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Вычисляет квадратный корень числа.
     *
     * @param number число
     * @return квадратный корень числа
     * @throws IllegalArgumentException если число отрицательное
     */
    public static double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число не может быть отрицательным");
        }
        return Math.sqrt(number);
    }
}

