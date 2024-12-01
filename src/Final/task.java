package Final;

class A {
    public final int a; // Объявление переменной

    // Инициализация через конструктор
    public A(int value) {
        this.a = value; // Инициализация
    }

    // Инициализация при объявлении
    public static final int b = 50;

    // Инициализация через блок
    public A() {
        a = 10; // Если конструктор без параметров
    }

    // Использование блока инициализации
//    {
//        // Пример блока с инициализацией
//        a = 25; // Это значение будет установлено при каждом создании объекта
//    }

    public static void main(String[] args) {
        A obj1 = new A(100);
        System.out.println("a = " + obj1.a); // Вывод: a = 100

        A obj2 = new A();
        System.out.println("a = " + obj2.a); // Вывод: a = 10 (или 25 в зависимости от порядка вызовов)

        System.out.println("b = " + b); // Вывод: b = 50
    }
}
