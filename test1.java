import java.util.HashMap;

public class test1 {
    public static void main(String[] args) {

        int[] numbers = {3, 1, 4, 2, 2, 4, 5, 3, 6};

        // Initialize variables to store first and second repeated numbers
        int firstRepeated = -1;
        int secondRepeated = -1;

        // Create a map to store the count of each number
        HashMap<Integer, Integer> countMap = new HashMap<>();

        // Iterate through the array
        for (int number : numbers) {
            // Retrieve the current count for the number or use 0 if not present
            int currentCount = countMap.getOrDefault(number, 0);

            // Increment the count by 1
            int updatedCount = currentCount + 1;

            // Put the updated count back into the map for the number
            countMap.put(number, updatedCount);

            // Check if it is the first repeated number
            if (updatedCount == 2 && firstRepeated == -1) {
                firstRepeated = number;
            } else if (updatedCount == 2 && firstRepeated != -1) {
                // If it's the second repeated number, break the loop
                secondRepeated = number;
                break;
            }
        }

        // Display the second repeated number
        System.out.println("Second Repeated Number: " + secondRepeated);
    }
}
