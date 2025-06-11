import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicatesInArray 
{
	public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);

        	System.out.print("Enter number of elements in the array: ");
        	int n = scanner.nextInt();
		int[] arr = new int[n];
        	System.out.println("Enter " + n + " elements:");
        	for (int i = 0; i < n; i++) 
		{
            		arr[i] = scanner.nextInt();
        	}

        	Set<Integer> seen = new HashSet<>();
        	Set<Integer> duplicates = new HashSet<>();

        	for (int num : arr) 
		{
            		if (seen.contains(num)) 
			{
                		duplicates.add(num);
            		} 
			else 
			{
                		seen.add(num);
            		}
        	}

        	if (duplicates.isEmpty()) 
		{
            		System.out.println("No duplicate elements found.");
        	} 
		else 
		{
            		System.out.println("Duplicate elements: " + duplicates);
        	}

            }
}
