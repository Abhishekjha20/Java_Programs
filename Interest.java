import java.util.*;
class Interest
{
	public static void main(String...s)
	{
		float amount,rate,time,interest;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount");
		amount =sc.nextFloat();
		System.out.println("");
		
		System.out.println("Enter the Rate");
		rate=sc.nextFloat();
		System.out.println("");
		
		System.out.println("Enter the Time");
		time=sc.nextFloat();
		System.out.println("");
		interest = (amount*rate*time)/100;
		
		System.out.println("Rate of Simple Interest is:" +interest);
		
		
	}
}