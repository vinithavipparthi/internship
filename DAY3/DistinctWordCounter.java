import java.util.*;

public class DistinctWordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String paragraph = scanner.nextLine();

        String[] words = paragraph.toLowerCase().split("\\W+");

        Set<String> distinctWords = new HashSet<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                distinctWords.add(word);
            }
        }

        System.out.println("Number of distinct words: " + distinctWords.size());
        System.out.println("Distinct words: " + distinctWords);

        scanner.close();
    }
}
