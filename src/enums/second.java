package enums;

// Определяем перечисление AccessLevel
enum AccessLevel {
    GUEST(1),
    USER(2),
    MODERATOR(3),
    ADMIN(4);

    private int level;

    // Конструктор для инициализации уровня доступа
    AccessLevel(int level) {
        this.level = level;
    }

    // Метод для получения уровня доступа
    public int getLevel() {
        return level;
    }

    // Метод для проверки уровня доступа
    public boolean hasAccess(AccessLevel requiredLevel) {
        // Возвращает true, если текущий уровень доступа больше или равен необходимому
        return this.level >= requiredLevel.getLevel();
    }
}