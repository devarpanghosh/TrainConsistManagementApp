import java.util.HashMap;
import java.util.Map;

/**
 * UC6: Mapping Bogies to Capacities using HashMap
 * Goal: Associate each bogie with its seating or load capacity.
 */
public class TrainConsistManagement {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App (UC6) ===");

        // 1. Create a HashMap<String, Integer> for bogie-capacity information
        // Key: Bogie Name (String), Value: Capacity (Integer)
        Map<String, Integer> bogieCapacities = new HashMap<>();

        // 2. Use the put() method to map each bogie to its capacity
        bogieCapacities.put("Sleeper", 72);
        bogieCapacities.put("AC Chair", 56);
        bogieCapacities.put("First Class", 24);

        // 3. Fast Lookup (Constant-time retrieval)
        // We can instantly find the capacity of a specific bogie
        String searchBogie = "AC Chair";
        System.out.println("Capacity of " + searchBogie + ": " + bogieCapacities.get(searchBogie) + " seats");

        System.out.println("\n--- Full Capacity Report ---");

        // 4. Iterate over the map using entrySet()
        // This provides access to both the Key and the Value in one loop
        for (Map.Entry<String, Integer> entry : bogieCapacities.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey() + " | Seating Capacity: " + entry.getValue());
        }

        // 5. Program continues
        System.out.println("\nTotal types of bogies managed: " + bogieCapacities.size());
    }
}