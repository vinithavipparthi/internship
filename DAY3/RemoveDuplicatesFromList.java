import java.util.*;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements in the list: ");
        int n = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        Set<Integer> set = new HashSet<>(list);
        List<Integer> uniqueList = new ArrayList<>(set);

        System.out.println("List after removing duplicates: " + uniqueList);

        scanner.close();
    }
}
