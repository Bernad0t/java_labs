package overflowParams;

class SumCalculator {

    // Метод, принимающий произвольное количество целых чисел
    public int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    // Метод, принимающий произвольное количество дробных чисел
    public double sum(double... numbers) {
        double total = 0.0;
        for (double num : numbers) {
            total += num;
        }
        return total;
    }

    // Метод, принимающий произвольное количество строковых представлений чисел
    public double sum(String... numbers) {
        double total = 0.0;
        for (String numStr : numbers) {
            total += Double.parseDouble(numStr);
        }
        return total;
    }
}