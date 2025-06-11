import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements in Set 1: ");
        int n1 = scanner.nextInt();
        Set<Integer> set1 = new HashSet<>();
        System.out.println("Enter elements of Set 1:");
        for (int i = 0; i < n1; i++) {
            set1.add(scanner.nextInt());
        }

        System.out.print("Enter number of elements in Set 2: ");
        int n2 = scanner.nextInt();
        Set<Integer> set2 = new HashSet<>();
        System.out.println("Enter elements of Set 2:");
        for (int i = 0; i < n2; i++) {
            set2.add(scanner.nextInt());
        }

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union of the sets: " + union);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection of the sets: " + intersection);

        scanner.close();
    }
}
