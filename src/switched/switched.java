package switched;

class SwitchExampleInt {
    public static void main(String[] args) {
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            default:
                System.out.println("Другой день");
        }
    }
}

class SwitchExampleChar {
    public static void main(String[] args) {
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Отлично");
                break;
            case 'B':
                System.out.println("Хорошо");
                break;
            case 'C':
                System.out.println("Удовлетворительно");
                break;
            default:
                System.out.println("Неизвестная оценка");
        }
    }
}

class SwitchExampleByte {
    public static void main(String[] args) {
        byte b = 1;
        switch (b) {
            case 1:
                System.out.println("Это один");
                break;
            case 2:
                System.out.println("Это два");
                break;
            default:
                System.out.println("Не один и не два");
        }
    }
}

class SwitchExampleStr {
    public static void main(String[] args) {
        String fruit = "Apple";
        switch (fruit) {
            case "Apple":
                System.out.println("Это яблоко");
                break;
            case "Banana":
                System.out.println("Это банан");
                break;
            default:
                System.out.println("Неизвестный фрукт");
        }
    }
}

enum Color {
    RED, GREEN, BLUE;
}

class SwitchExampleEnum {
    public static void main(String[] args) {
        Color color = Color.GREEN;
        switch (color) {
            case RED:
                System.out.println("Красный");
                break;
            case GREEN:
                System.out.println("Зеленый");
                break;
            case BLUE:
                System.out.println("Синий");
                break;
            default:
                System.out.println("Неизвестный цвет");
        }
    }
}


