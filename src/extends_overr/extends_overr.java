package extends_overr;

class Animal {
    // Метод для издания звука
    public void sound() {
        System.out.println("Животное издает звук.");
    }
}

class Dog extends Animal {
    // Переопределение метода sound()
    @Override
    public void sound() {
        System.out.println("Собака лает.");
    }
}

class Cat extends Animal {
    // Переопределение метода sound()
    @Override
    public void sound() {
        System.out.println("Кошка мяукает.");
    }
}