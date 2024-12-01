package template;
import java.util.ArrayList;
import java.util.List;
// Параметризованный класс
class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

class InstanceOfSimpleExample {
    public static void main(String[] args) {
        // Создаем экземпляры Box
        Box<String> stringBox = new Box<>("Hello");
        Box<Integer> integerBox = new Box<>(123);

        // Проверяем тип объектов с помощью instanceof
        checkBox(stringBox);
        checkBox(integerBox);
    }

    // Метод для проверки типа Box
    public static void checkBox(Box<?> box) {
        if (box instanceof Box) {
            System.out.println("Это экземпляр класса Box с содержимым: " + box.getItem());
        }
    }
}



class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class ExtendsExample {
    public static void makeSounds(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.makeSound();  // Здесь можно работать с объектами типа Animal и его подклассов
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

        makeSounds(dogs); // Выведет: Woof
        makeSounds(cats); // Выведет: Meow
    }
}

class SuperExample {
    public static void addAnimals(List<? super Dog> list) {
        list.add(new Dog()); // Мы можем добавлять объекты типа Dog
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        addAnimals(animals); // Добавит собаку в список

        for (Object obj : animals) {
            ((Animal) obj).makeSound(); // Приведение к Animal для вызова метода
        }
    }
}

/*Нужны для безопасности типов: Они позволяют избежать ClassCastException и других ошибок, связанных с приведением типов.
 Мы знаем, что можем безопасно работать с двумя классами, имеющими отношение по иерархии.*/