import java.util.*;
class AreaOfCircleAndCircumference
{
	public static void main(String...s)
	{
	 double radius,area,circumference;
	
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the Radius :");
	 radius=sc.nextDouble();
	 // Area = pi*radius*radius
	  area = Math.PI *(radius * radius);
	  System.out.println("The area of circle is: " +area);
	  
	  //circumference= 2*pi*r
	  circumference= 2*Math.PI*radius;
	 System.out.println("The circumference is: "+ circumference);
	}
}
