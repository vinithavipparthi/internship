import java.util.*;
class CheckPangram
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String sentence=sc.nextLine();
		if(isPangram(sentence))
		{
			System.out.println(sentence+"is a pangram");
		}
		else
		{
			System.out.println(sentence+"is not a pangram");
		}
	}
	public static Boolean isPangram(String input)
	{
		input=input.toLowerCase();
		HashSet<Character> letters=new HashSet<>();
		for(char ch:input.toCharArray())
		{
			if(ch>='a' && ch<='z')
			{
				letters.add(ch);
			}
		}
		return letters.size()==26;
	}
}