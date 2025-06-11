import java.util.*;

public class SecondLargestFinder 
{
    public static void main(String[] args) 
    {
        List<Integer> numbers = Arrays.asList(10, 20, 4, 45, 99, 99);

        System.out.println("Using Sorting:");
        Integer secondLargestSorted = findSecondLargestBySorting(new ArrayList<>(numbers));
        if (secondLargestSorted != null) {
            System.out.println("Second largest: " + secondLargestSorted);
        } else {
            System.out.println("List does not have a second largest element.");
        }

    }

    public static Integer findSecondLargestBySorting(List<Integer> list) 
    {
        if (list.size() < 2) 
        {
            return null;
        }
        Set<Integer> uniqueSet = new HashSet<>(list);
        if (uniqueSet.size() < 2) return null;
        List<Integer> uniqueList = new ArrayList<>(uniqueSet);
        Collections.sort(uniqueList, Collections.reverseOrder());
        return uniqueList.get(1); 

    }
}
