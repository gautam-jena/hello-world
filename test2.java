import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class test2 {
    public static void main(String[] args) {

        String str = "capegimibangalore";

        // Find the first repeating character
        char firstRepeatingChar = str.chars()
                .mapToObj(c -> (char) c)
                .collect(
                        Collectors.groupingBy( c -> c,LinkedHashMap :: new, Collectors.counting())
                )
                              //  c -> c,
                              //  LinkedHashMap::new,
                              //  Collectors.counting()

                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .skip(3)
                .map(Map.Entry::getKey)
                .findFirst()

                .orElseThrow(() -> new RuntimeException("No repeating character found"));

        System.out.println("First repeating character: " + firstRepeatingChar);


         }
    }

