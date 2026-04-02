import java.util.HashSet;
import java.util.Set;

/**
 * UC3: Ensure Unique Bogie IDs using HashSet
 * Goal: Prevent duplicate bogie IDs from being added to the train.
 */
public class TrainConsistManagement {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App (UC3) ===");

        // 1. Create a HashSet<String> for bogie IDs
        // We use the Set interface to enforce uniqueness.
        Set<String> bogieIds = new HashSet<>();

        // 2. System inserts bogie IDs into HashSet
        bogieIds.add("B-101");
        bogieIds.add("B-102");
        bogieIds.add("B-103");

        // 3. Attempt to add a duplicate ID
        // The add() method returns false if the element already exists.
        boolean isAdded = bogieIds.add("B-101");

        if (!isAdded) {
            System.out.println("Duplicate ID 'B-101' ignored.");
        }

        // 4. Unique IDs are displayed
        // Note: The order of output may differ from insertion order.
        System.out.println("Unique Bogie IDs in System: " + bogieIds);

        System.out.println("Total Unique Bogies: " + bogieIds.size());
    }
}