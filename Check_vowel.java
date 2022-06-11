import java.util.*;
class Check_vowel
{
	public static void main(String...s)
	{   char c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		c=sc.nextLine().charAt(0);
		
		switch(c)
		{
		case'a':
		case'e':
		case'i':
		case'o':
		case'u': System.out.println(c + " is a vowel");
		
		break;
		default: System.out.println(c + " is a consonant");
		}
		
	}
}