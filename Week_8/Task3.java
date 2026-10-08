package Week_8;

interface SearchAlgorithm {
    void search(int[] arr, int key);
}

class LinearSearch implements SearchAlgorithm {

    public void search(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                return;
            }
        }

        System.out.println("Element not found");
    }
}

class BinarySearch implements SearchAlgorithm {

    public void search(int[] arr, int key) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index " + mid);
                return;
            }

            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Element not found");
    }
}

public class Task3 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        SearchAlgorithm algorithm;

        algorithm = new LinearSearch();
        algorithm.search(arr, 30);

        algorithm = new BinarySearch();
        algorithm.search(arr, 40);
    }
}