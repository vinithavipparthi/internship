import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();

        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        scanner.close();
    }

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        Map<Character, Integer> freqMap1 = new HashMap<>();
        Map<Character, Integer> freqMap2 = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            freqMap1.put(ch, freqMap1.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s2.toCharArray()) {
            freqMap2.put(ch, freqMap2.getOrDefault(ch, 0) + 1);
        }

        return freqMap1.equals(freqMap2);
    }
}
