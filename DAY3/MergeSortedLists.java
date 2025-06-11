import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSortedLists {

    public static List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

         while (i < list1.size()) 
	{
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) 
	{
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements of the first sorted list:");
        List<Integer> list1 = readIntegerList(scanner);

        System.out.println("Enter the elements of the second sorted list:");
        List<Integer> list2 = readIntegerList(scanner);

        List<Integer> mergedList = mergeSortedLists(list1, list2);

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Merged List: " + mergedList);

        scanner.close();
    }

  	private static List<Integer> readIntegerList(Scanner scanner) {
        List<Integer> list = new ArrayList<>();
        String line = scanner.nextLine();
        String[] elements = line.split(" ");

        for (String element : elements) {
            try {
                int number = Integer.parseInt(element);
                list.add(number);
            } catch (NumberFormatException e) {
                System.err.println("Invalid input: " + element + " is not an integer. Skipping.");
              
            }
        }
        return list;
    }
}
