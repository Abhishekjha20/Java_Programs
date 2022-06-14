import java.util.*;
class ArmStrongNo
{
	
	public static void main(String...s)
	{   
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int temp = n;
		int res = 0;
		while(temp>0)
		{
			int lastdigit = temp%10;
			res= res + lastdigit*lastdigit*lastdigit;
			temp =temp/10;
		} 
		if(res==n)
		{
			System.out.println("Number is armstronge");
		}
		else
		{
			System.out.println("Number is not armstronge");
		}
	}
}