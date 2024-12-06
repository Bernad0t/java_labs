package classFinal;

class SuperClass {
    // Метод суперкласса, объявленный как final
    public final void display() {
        System.out.println("Этот метод нельзя переопределить.");
    }
}

class SubClass extends SuperClass {
    // Попытка переопределить метод display() приведет к ошибке компиляции
    /*
    @Override
    public void display() { // Это вызовет ошибку компиляции
        System.out.println("Попытка переопределить метод.");
    }
    */
}

class FinalMethodExample {
    public static void main(String[] args) {
        SuperClass superObj = new SuperClass();
        superObj.display(); // Вызовет метод суперкласса

        SubClass subObj = new SubClass();
        subObj.display(); // Вызовет метод суперкласса, так как не было переопределения
    }
}