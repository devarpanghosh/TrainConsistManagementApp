import java.util.ArrayList;
import java.util.List;

/**
 * UC1: Initialize the Train Consist Management App
 * Goal: Initialize the app and display the initial state of the train.
 */
public class TrainConsistManagement {

    public static void main(String[] args) {
        // 1. Print a welcome message
        System.out.println("=== Train Consist Management App ===");

        /* * 2. Initialize an empty List using ArrayList.
         * We use the List interface for abstraction and ArrayList
         * for dynamic resizing capabilities.
         */
        List<String> trainBogies = new ArrayList<>();

        /* * 3. Display the initial bogie count.
         * Since we just initialized it, the size() should be 0.
         */
        int initialCount = trainBogies.size();
        System.out.println("Initial bogie count: " + initialCount);

        // 4. Program continues...
        System.out.println("Application initialized successfully. Ready for further operations.");
    }
}