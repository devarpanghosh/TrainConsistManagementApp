import java.util.ArrayList;
import java.util.List;

/**
 * UC2: Dynamic Insertion and Removal of Passenger Bogies
 * Goal: Use ArrayList methods to manage the train consist.
 */
public class TrainConsistManagement {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App (UC2) ===");

        // 1. Create an ArrayList<String> for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // 2. Add bogies: Sleeper, AC Chair, First Class
        // The add() method demonstrates Insertion Order Preservation
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // 3. Print the list after insertion
        System.out.println("Current Bogies: " + passengerBogies);

        // 4. Remove one bogie (e.g., AC Chair)
        // This demonstrates the dynamic resizing of the ArrayList
        passengerBogies.remove("AC Chair");
        System.out.println("Removed: AC Chair");

        // 5. Use contains() to check if Sleeper exists
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Is 'Sleeper' in the consist? " + hasSleeper);

        // 6. Print final list state
        System.out.println("Final Bogie List: " + passengerBogies);
        System.out.println("Final Count: " + passengerBogies.size());
    }
}