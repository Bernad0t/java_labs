package liskov;

public class example_liskov {
    public class Shape {
        public void draw() {
            System.out.println("Drawing a shape...");
        }
    }

    public class Circle extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a circle...");
        }
    }
}
