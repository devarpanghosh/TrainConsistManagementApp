import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * UC7: Sorting Bogies by Capacity using a Custom Comparator
 * Goal: Use object-oriented principles to sort complex data.
 */

// 1. Create a Bogie class with fields such as name and capacity
class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() { return name; }
    public int getCapacity() { return capacity; }

    @Override
    public String toString() {
        return String.format("%s (Capacity: %d)", name, capacity);
    }
}

public class TrainConsistManagement {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App (UC7) ===");

        // 2. Create a List<Bogie> to store passenger bogies
        List<Bogie> passengerBogies = new ArrayList<>();

        // 3. Add bogies: Sleeper, AC Chair, and First Class with capacities
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));

        System.out.println("Original List: " + passengerBogies);

        /* * 4. Use Comparator.comparingInt() to define sorting based on capacity.
         * We use a Lambda Expression (b -> b.getCapacity()) for a concise syntax.
         */
        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        // 5. Display the sorted bogies
        System.out.println("\nSorted by Capacity (Ascending):");
        for (Bogie b : passengerBogies) {
            System.out.println("- " + b);
        }

        // Bonus: Sorting in descending order
        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());
        System.out.println("\nSorted by Capacity (Descending):");
        passengerBogies.forEach(System.out::println);
    }
}