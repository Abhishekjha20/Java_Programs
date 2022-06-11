import java.util.*;
class Find_cube
{
	public static void main(String...s)
	{
		int number,cube;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		number=sc.nextInt();
		
		if(number%2==0)
		{
			
			System.out.println("You have entered Even number:");
			cube = number*number*number;
			System.out.println(+number+  " = " +cube); 
			
	    }
		else
		{
			System.out.println("You have entered odd number");
		}
	}
}