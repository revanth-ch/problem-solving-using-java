package Week_8;

class SortingAlgorithm {

    void sort(int[] arr) {
        System.out.println("Sorting using a general algorithm");
    }
}

class BubbleSort extends SortingAlgorithm {

    @Override
    void sort(int[] arr) {
        System.out.println("Sorting using Bubble Sort");
    }
}

class QuickSort extends SortingAlgorithm {

    @Override
    void sort(int[] arr) {
        System.out.println("Sorting using Quick Sort");
    }
}

public class Task1 {

    public static void main(String[] args) {

        SortingAlgorithm algorithm;

        algorithm = new BubbleSort();
        algorithm.sort(new int[]{5, 2, 8});

        algorithm = new QuickSort();
        algorithm.sort(new int[]{5, 2, 8});
    }
}