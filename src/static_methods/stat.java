package static_methods;

class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
}

class Main {
    public static void main(String[] args) {
        A.printVars(); // Вызов статического метода через имя класса
        A a = new A();
        a.printVars();
    }
}