import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Set<Character> distinctChars = new HashSet<>();
        for (char ch : input.toCharArray()) 
	{
            if (!Character.isWhitespace(ch)) 
	    { 
                distinctChars.add(ch);
            }
        }

        System.out.println("Distinct characters in the string: " + distinctChars);

        scanner.close();
    }
}
