import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortUsingTreeSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        Set<Integer> sortedSet = new TreeSet<>();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            sortedSet.add(scanner.nextInt());
        }

        System.out.println("Sorted elements using TreeSet: " + sortedSet);

        scanner.close();
    }
}
