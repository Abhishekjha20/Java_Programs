import java.util.*;
class Rectangel
{
	public static void main(String...s)
	{
		double l,b,area,perimeter;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length");
		l= sc.nextDouble();
		System.out.println("Enter the breath");
		b=sc.nextDouble();
		//area = l*b
		area=l*b;
		System.out.println("The area of rectangle is: " +area);
		//perimeter = 2*(l+b)
		
		perimeter=2*(l+b);
		
		System.out.println("The perimeter of rectangle is: " +perimeter);
		
	}
}