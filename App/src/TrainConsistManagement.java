import java.util.LinkedList;

/**
 * UC4: Managing Train Consist using LinkedList
 * Goal: Model real-world chaining behavior for efficient insertions and deletions.
 */
public class TrainConsistManagement {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App (UC4) ===");

        // 1. Create a LinkedList<String> for the consist
        // We use the specific LinkedList class to access addFirst/addLast methods
        LinkedList<String> trainConsist = new LinkedList<>();

        // 2. Add bogies: Engine, Sleeper, AC, Cargo, Guard
        // Standard add() attaches to the end of the list
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Consist: " + trainConsist);

        // 3. Insert a Pantry Car at position 2 (Index starts at 0)
        // This is very efficient in a LinkedList compared to an ArrayList
        trainConsist.add(2, "Pantry Car");
        System.out.println("After adding Pantry Car at index 2: " + trainConsist);

        // 4. Remove the first and last bogie
        // This simulates detaching the Engine and the Guard van
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("After removing First and Last bogies: " + trainConsist);

        // 5. Display the final ordered train consist
        System.out.println("Final Consist Sequence: " + String.join(" <-> ", trainConsist));
    }
}