package enums;

// Определяем перечисление
enum Day {
    SUNDAY("Weekend"),
    MONDAY("Weekday"),
    TUESDAY("Weekday"),
    WEDNESDAY("Weekday"),
    THURSDAY("Weekday"),
    FRIDAY("Weekday"),
    SATURDAY("Weekend");

    private String type;

    // Конструктор для инициализации типа дня
    Day(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

// Класс для демонстрации использования перечисления
class EnumExample {
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.printf("%s is a %s.%n", day, day.getType());
        }
    }
}
