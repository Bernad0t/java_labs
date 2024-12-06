package classFinal;

// Объявляем класс как final
final class FinalClass {
    public void display() {
        System.out.println("Это метод final-класса.");
    }
}

// Попытка создать подкласс
//class SubClass extends FinalClass { // Это вызовет ошибку
//    public void show() {
//        System.out.println("Это метод подкласса.");
//    }
//}

class FinalClassExample {
    public static void main(String[] args) {
        FinalClass finalObj = new FinalClass();
        finalObj.display(); // Вызов метода final-класса

        // SubClass subObj = new SubClass(); // Эта строка не будет скомпилирована
    }
}