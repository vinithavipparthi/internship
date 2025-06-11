import java.util.*;

public class RotateList {
    public static void rotateList(List<Integer> list, int k) {
        int n = list.size();
        if (n == 0 || k % n == 0) {
            return; 
        }

        k = k % n; 
        List<Integer> lastPart = new ArrayList<>(list.subList(n - k, n));
        List<Integer> firstPart = new ArrayList<>(list.subList(0, n - k));

        list.clear(); 
	list.addAll(lastPart);
        list.addAll(firstPart);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();

         List<Integer> list = new ArrayList<>();
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        System.out.print("Enter the number of steps to rotate right (k): ");
        int k = scanner.nextInt();

        System.out.println("Original list: " + list);
        rotateList(list, k);
        System.out.println("Rotated list (right by " + k + " steps): " + list);

        scanner.close();
    }
}
