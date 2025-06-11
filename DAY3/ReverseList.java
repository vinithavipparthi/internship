import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReverseList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements of the list, separated by spaces:");
        String inputLine = scanner.nextLine();
        List<String> list = new ArrayList<>(Arrays.asList(inputLine.split(" ")));

        System.out.println("Original list: " + list);

        reverseListInPlace(list);

        System.out.println("Reversed list: " + list);

        scanner.close();
    }

    public static void reverseListInPlace(List<String> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            String temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
}
