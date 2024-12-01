package arrs;

import java.util.Arrays;

class ToStringExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String result = Arrays.toString(numbers);
        System.out.println(result); // Вывод: [1, 2, 3, 4, 5]
    }
}

class BinarySearchExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        // Сначала сортируем массив (если он не отсортирован)
        Arrays.sort(numbers);

        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("Индекс элемента 3: " + index); // Вывод: Индекс элемента 3: 2

        // Поиск несуществующего элемента
        int notFoundIndex = Arrays.binarySearch(numbers, 6);
        System.out.println("Индекс элемента 6: " + notFoundIndex); // Вывод: Индекс элемента 6: -6
    }
}

class EqualsExample {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {4, 5, 6};

        boolean isEqual1 = Arrays.equals(array1, array2);
        boolean isEqual2 = Arrays.equals(array1, array3);

        System.out.println("Массивы array1 и array2 равны? " + isEqual1); // true
        System.out.println("Массивы array1 и array3 равны? " + isEqual2); // false
    }
}

class CompareExample {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 4};

        int comparisonResult = Arrays.compare(array1, array2);

        if (comparisonResult < 0) {
            System.out.println("array1 меньше, чем array2");
        } else if (comparisonResult > 0) {
            System.out.println("array1 больше, чем array2");
        } else {
            System.out.println("array1 и array2 равны");
        }
    }
}

class SortExample {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 4, 1, 2};
        Arrays.sort(numbers);

        System.out.println("Отсортированный массив: " + Arrays.toString(numbers)); // Вывод: [1, 2, 3, 4, 5]
    }
}
