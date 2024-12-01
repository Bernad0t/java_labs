package class_wrappers;

class DecodeExample {
    public static void main(String[] args) {
        String decimalString = "123";
        Integer decimalValue = Integer.decode(decimalString);

        System.out.println("Декодированное десятичное значение: " + decimalValue); // Вывод: 123
    }
}

class CreateBoolean{
    Boolean bool1 = Boolean.valueOf(true);   // bool1 будет истинным (true)
    Boolean bool2 = Boolean.valueOf(false);  // bool2 будет ложным (false)

    boolean primitiveBool = true;
    Boolean bool3 = primitiveBool; // Автоупаковка
    Boolean bool4 = true;
}

class AutoUnboxingExample {
    public static void main(String[] args) {
        // Используем объект Boolean
        Boolean boolObject = null; // Присваиваем null

        // Попытка автораспаковки
        try {
            boolean boolPrimitive = boolObject; // Автоупаковка (unboxing)
            System.out.println("Значение примитива: " + boolPrimitive);
        } catch (NullPointerException e) { // ошибка возникает при автоупаковке объекта со значением null
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}


