package extends_attr;

// Приватный доступ
class PrivateAccessExample {
    private int privateVar = 10;

    private void privateMethod() {
        System.out.println("Это приватный метод.");
    }

    public void display() {
        System.out.println("Private переменная: " + privateVar);
        privateMethod();
    }
}

// Доступ по умолчанию
class DefaultAccessExample {
    int defaultVar = 20;

    void defaultMethod() {
        System.out.println("Это метод с доступом по умолчанию.");
    }
}

// Защищенный доступ
class ProtectedAccessExample {
    protected int protectedVar = 30;

    protected void protectedMethod() {
        System.out.println("Это protected метод.");
    }
}

// Подкласс для демонстрации protected доступа
class SubClass extends ProtectedAccessExample {
    void display() {
        System.out.println("Protected переменная из подкласса: " + protectedVar);
        protectedMethod();
    }
}

// Публичный доступ
class PublicAccessExample {
    public int publicVar = 40;

    public void publicMethod() {
        System.out.println("Это public метод.");
    }
}
