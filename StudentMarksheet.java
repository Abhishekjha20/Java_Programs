	import java.util.*;
	class StudentMarksheet
	{
		public static void main(String...s)
		{
			String name;
			int rollnum;
			int eng, phy, che, math,hindi;
			double total, percentage; 
			
			Scanner sc = new Scanner(System.in); 
			 System.out.println("Enter the student name");
			 name=sc.nextLine();
			 System.out.println("Student Name is: " + name);
			 System.out.println("");
			 System.out.println("Enter the roll number");
			 rollnum=sc.nextInt();
			 System.out.println("Student Roll Number is: "+ rollnum);
			 System.out.println("");
			 System.out.println("Enter the five subject mark");
			 System.out.println(""); 
			 System.out.println("Enter the english mark");
			 eng = sc.nextInt();
			 System.out.println("English: " + eng);
			 System.out.println("Enter the physics mark");
			 phy = sc.nextInt();
			 System.out.println("Physics: " + phy);
			 System.out.println("Enter the chemistry mark");
			 che = sc.nextInt();
			 System.out.println("Chemistry: " + che);
			 System.out.println("Enter the math mark");
			 math = sc.nextInt();
			 System.out.println("Math: "+ math);
			 System.out.println("Enter the hindi mark");
			 hindi = sc.nextInt();
			 System.out.println("Hindi: "+ hindi);
			 
			 total = eng+ phy+che+math+hindi;
			 
			 percentage = (total/500)*100;
			 
			 System.out.println("Total marks = "+total);

			 System.out.println("Percentage = " +percentage);
		}
	}