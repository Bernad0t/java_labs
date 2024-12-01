package data_types;

class PrimitiveTypesExample {
    public static void main(String[] args) {
        // Примитивные типы данных
        byte aByte = 10;             // Пример byte
        short aShort = 1000;         // Пример short
        int anInt = 123456;          // Пример int
        long aLong = 12345678901L;   // Пример long
        float aFloat = 10.5f;        // Пример float
        double aDouble = 20.99;      // Пример double
        char aChar = 'A';            // Пример char
        boolean aBoolean = true;     // Пример boolean

        // Значения null
        byte nullByte = 0;           // Пример null для byte, значения 0
        short nullShort = 0;         // Пример null для short, значения 0
        int nullInt = 0;             // Пример null для int, значения 0
        long nullLong = 0;           // Пример null для long, значения 0
        float nullFloat = 0.0f;      // Пример null для float, значения 0.0
        double nullDouble = 0.0;     // Пример null для double, значения 0.0
        char nullChar = '\u0000';    // Пример null для char, значение 0 (null символ)
        boolean nullBoolean = false;  // Пример null для boolean, значения false
    }
}

class UnicodeExample {
    public static void main(String[] args) {
        // Выводим имя "Миша" с использованием Unicode
        System.out.println("\u041C\u0438\u0448\u0430");
    }
}

class OperatorOverloadingExample {
    public static void main(String[] args) {
        // Пример 1: Объединение строки и int
        String str1 = "Возраст: ";
        int age = 25;
        String result1 = str1 + age; // "Возраст: 25"
        System.out.println(result1);

        // Пример 2: Объединение строки и float
        String str2 = "Цена: ";
        double price = 19.99;
        String result2 = str2 + price; // "Цена: 19.99"
        System.out.println(result2);

        // Пример 3: Объединение строки и булевого значения
        String str3 = "Статус: ";
        boolean isAvailable = true;
        String result3 = str3 + isAvailable; // "Статус: true"
        System.out.println(result3);
    }
}

class ArithmeticOperationsExample {
    public void IntFloat() {
        float floatValue = 3.5f;
        int intValue = 2;

        // Умножение float и int
        float result2 = floatValue * intValue;

        System.out.println("Умножение float и int: " + result2); // Вывод: 7.0, т к double > int
    }

    public void IndDivFloat() {
        int intValue = 10;
        double doubleValue = 3.0;

        // Деление int на double
        double result3 = intValue / doubleValue;

        System.out.println("Деление int на double: " + result3); // Вывод: 3.3333333333333335, т к double > int
    }
}

class NarrowingConversionExample {
    public static void main(String[] args) {
        double doubleValue = 9.99;
        // Сужающее преобразование: double -> int
        int intValue = (int) doubleValue;

        System.out.println("После сужающего преобразования в int: " + intValue); // Вывод: 9
    }
}
