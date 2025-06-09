import java.util.*;
class Triangle
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	double a=sc.nextDouble();
	double b=sc.nextDouble();
	double c=sc.nextDouble();
	double perimeter=a+b+c;
	System.out.println("Perimeter:"+perimeter);
	double base=sc.nextDouble();
	double height=sc.nextDouble();
	double area=0.5*base*height;
	System.out.println("Area :"+area);
	}
}
	
