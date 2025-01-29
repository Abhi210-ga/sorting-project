public class SelectionSort implements Sorter {

    @Override
    public void sort(int[] input) {
        System.out.println("Selection Sort!!!");

        int n = input.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (input[j] < input[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = input[minIndex];
            input[minIndex] = input[i];
            input[i] = temp;
        }
    }
}
