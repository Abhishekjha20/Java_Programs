import java.util.*;
class Profit_Loss
{
	public static void main(String...s)
	{
		int cost,selling;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cost price");
		cost=sc.nextInt();
		System.out.println("");
		System.out.println("Enter the selling price");
		selling=sc.nextInt();
		
		 if(cost<selling)
		 {
			 
			 		System.out.println("The profit is: " + (selling-cost));
		 }
	    if(cost>selling)
		{
					System.out.println("The loss is: " + (cost-selling));
		}
		
		
		
	}
}