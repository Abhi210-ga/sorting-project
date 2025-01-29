import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
        // Generate random array for testing
        int[] testInput = generateRandomArray(1000);

        // Run the TestSuite with 10 loops for more accurate benchmarking
        TestSuite.run(testInput, 10);  // Running 10 loops for better performance results
    }

    // Method to generate a random array of integers
    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(1000);  // Random integers between 0 and 999
        }
        return array;
    }
}
