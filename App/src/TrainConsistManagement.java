import java.util.LinkedHashSet;
import java.util.Set;

/**
 * UC5: Maintain Insertion Order while Enforcing Uniqueness
 * Goal: Use LinkedHashSet to ensure no duplicate bogies exist while
 * preserving the physical attachment sequence.
 */
public class TrainConsistManagement {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App (UC5) ===");

        // 1. Create a LinkedHashSet<String> to represent the train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // 2. Attach bogies: Engine, Sleeper, Cargo, Guard
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        System.out.println("Initial Formation: " + trainFormation);

        // 3. Attempt to attach a duplicate bogie (e.g., Sleeper again)
        // LinkedHashSet will automatically ignore this.
        boolean isAdded = trainFormation.add("Sleeper");

        if (!isAdded) {
            System.out.println("\nAlert: Attempted to add duplicate 'Sleeper'. Action ignored.");
        }

        // 4. Display the final formation order
        // 5. Ensure that duplicates do not appear in the output
        System.out.println("\nFinal Formation (Order Preserved):");
        System.out.println(String.join(" -> ", trainFormation));

        System.out.println("\nTotal Unique Bogies: " + trainFormation.size());
    }
}