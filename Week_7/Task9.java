package Week_7;

public class Task9 {

    static class Printer {

        public <T> void printArray(T[] array) {

            for (T element : array) {
                System.out.println(element);
            }
        }
    }

    public static void main(String[] args) {

        Integer[] numbers = {
            1, 2, 3
        };

        String[] names = {
            "Java",
            "Python",
            "C++"
        };

        Printer printer = new Printer();

        printer.printArray(numbers);
        printer.printArray(names);
    }
}