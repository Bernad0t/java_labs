Что выведет данный код и почему?

    public class A {
        {
        System.out.println("logic (1) id= " + this.id);
        }
    
        static {
            System.out.println("static logic");
        }
    
        private int id = 1;
    
        public A(int id) {
            this.id = id;
            System.out.println("ctor id= " + id);
        }
    
        {
            System.out.println("logic (2) id= " + id);
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            new A(100);
        }
    }

Результат:

static logic

logic (1) id= 0

logic (2) id= 1

ctor id= 100

сначала вызываются static логические блоки, потом остальные логические блоки в порядке сверху вниз. только затем конструктор. инициализация id происходит между блоками, так что во втором блоке будет id = 1