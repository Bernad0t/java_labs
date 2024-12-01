package Operators;

class OperatorsExample {
    public static void main(String[] args) {
        // Определение переменных для примеров
        int a = 10;
        int b = 5;
        double d = 12.5;
        String str1 = "Hello";
        String str2 = " World";
        boolean bool1 = true;
        boolean bool2 = false;

        // Операторы присваивания: =, +=, -=, *=, /=, %=

        // Присваивание
        int c = a; // c = 10

        // Сложение с присваиванием
        c += b; // c = c + b (10 + 5 = 15)

        // Вычитание с присваиванием
        c -= 2; // c = c - 2 (15 - 2 = 13)

        // Умножение с присваиванием
        c *= 2; // c = c * 2 (13 * 2 = 26)

        // Деление с присваиванием
        c /= 2; // c = c / 2 (26 / 2 = 13)

        // Остаток от деления с присваиванием
        c %= 3; // c = c % 3 (13 % 3 = 1)

        System.out.println("Результаты присваивания c: " + c); // Вывод: Результаты присваивания c: 1


        // Операторы условного выражения: ?:

        int max = (a > b) ? a : b; // max будет равно 10 (a больше b)
        System.out.println("max: " + max); // Вывод: max: 10


        // Логические операторы: ||, &&

        boolean result1 = bool1 || bool2; // true || false = true
        boolean result2 = bool1 && bool2; // true && false = false
        System.out.println("result1 (||): " + result1); // Вывод: result1 (||): true
        System.out.println("result2 (&&): " + result2); // Вывод: result2 (&&): false


        // Побитовые операторы: |, ^, &

        int bitResult1 = a | b; // 10 | 5
        int bitResult2 = a ^ b; // 10 ^ 5
        int bitResult3 = a & b; // 10 & 5
        System.out.println("Побитовый ИЛИ (|): " + bitResult1); // Вывод: 15
        System.out.println("Побитовый ИСКЛЮЧИТЕЛЬНЫЙ И (^) : " + bitResult2); // Вывод: 15
        System.out.println("Побитовый И (&): " + bitResult3); // Вывод: 0


        // Операторы сравнения: ==, >, >=, <, <=

        boolean equal = (a == b); // false
        boolean greater = (a > b); // true
        boolean greaterOrEqual = (a >= b); // true
        boolean less = (a < b); // false
        boolean lessOrEqual = (a <= b); // false
        System.out.println("a == b: " + equal); // Вывод: false
        System.out.println("a > b: " + greater); // Вывод: true
        System.out.println("a >= b: " + greaterOrEqual); // Вывод: true
        System.out.println("a < b: " + less); // Вывод: false
        System.out.println("a <= b: " + lessOrEqual); // Вывод: false


        // Шифтовые операторы: >>, >>>, <<

        int leftShift = a << 2; // 10 << 2 = 40
        int rightShift = a >> 2; // 10 >> 2 = 2
        int unsignedRightShift = -10 >>> 2; // Беззнаковый сдвиг 10 (число отрицательное)
        System.out.println("Left shift (<<): " + leftShift); // Вывод: 40
        System.out.println("Right shift (>>): " + rightShift); // Вывод: 2
        System.out.println("Unsigned right shift (>>>): " + unsignedRightShift); // Вывод зависит от представления числа


        // Операторы арифметики: +, -

        int sum = a + b; // 10 + 5 = 15
        int difference = a - b; // 10 - 5 = 5
        System.out.println("Сумма: " + sum); // Вывод: 15
        System.out.println("Разность: " + difference); // Вывод: 5


        // Операторы арифметики: *, /, %

        double multiplication = a * d; // 10 * 12.5 = 125.0
        double division = d / a; // 12.5 / 10 = 1.25
        int modulus = a % b; // 10 % 5 = 0
        System.out.println("Умножение: " + multiplication); // Вывод: 125.0
        System.out.println("Деление: " + division); // Вывод: 1.25
        System.out.println("Остаток: " + modulus); // Вывод: 0


        // Операторы инкремента и декремента: ++, -- (постфиксная и префиксная форма)

        int preIncrement = ++a; // Префиксная форма
        int postIncrement = b++; // Постфиксная форма, b сначала используется
        int preDecrement = --b; // Префиксная форма
        int postDecrement = a--; // Постфиксная форма, a сначала используется

        System.out.println("Префиксный инкремент: " + preIncrement); // Вывод: 11
        System.out.println("Постфиксный инкремент: " + postIncrement); // Вывод: 5
        System.out.println("Префиксный декремент: " + preDecrement); // Вывод: 4
        System.out.println("Постфиксный декремент: " + postDecrement); // Вывод: 10


        // Оператор побитового NOT: ~
        int bitwiseNot = ~a; // побитовый NOT
        System.out.println("Побитовый NOT (~): " + bitwiseNot); // Вывод: -5 (в зависимости от числа a)

        // Логический NOT: !
        boolean notResult = !bool1; // логическое отрицание
        System.out.println("Логическое отрицание (!): " + notResult); // Вывод: false


        // Скобки и индексы: ( ), [ ]

        System.out.println("Индекс строки: " + str1.charAt(0)); // Вывод: H (доступ к первому символу)

        String concatenated = str1 + str2; // Конкатенация строк
        System.out.println("Результат конкатенации: " + concatenated); // Вывод: Hello World
    }
}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

class InstanceOfExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        System.out.println("myDog является экземпляром Dog: " + (myDog instanceof Dog)); // true
        System.out.println("myDog является экземпляром Animal: " + (myDog instanceof Animal)); // true
        System.out.println("myCat является экземпляром Cat: " + (myCat instanceof Cat)); // true
        System.out.println("myCat является экземпляром Dog: " + (myCat instanceof Dog)); // false
    }
}

class NullInstanceOfExample {
    public static void main(String[] args) {
        Animal myAnimal = null;

        // Применение instanceof к null
        System.out.println("myAnimal является экземпляром Animal: " + (myAnimal instanceof Animal)); // false
        System.out.println("myAnimal является экземпляром Dog: " + (myAnimal instanceof Dog)); // false
        System.out.println("myAnimal является экземпляром Cat: " + (myAnimal instanceof Cat)); // false
    }
}


