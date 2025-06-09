class Human
{
	int age;
	String gender;
	public void show(int age,String gender)
	{
		this.age=age;
		this.gender=gender;
	}
	public void display()
	{
		
		System.out.println("In Human Class");
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gender);
	}
}
class Student
{
	String name;
	int marks;
	public void show1(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	public void display1()
	{
		System.out.println("In Student Class");

		System.out.println("Name:"+name);
		System.out.println("Marks:"+marks);
	}
}
class Developer
{
	String name;
	String role;
	String location;
	public void show(String name,String role,String location)
	{
		this.name=name;
		this.role=role;
		this.location=location;
	}
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Role:"+role);
		System.out.println("Loation:"+location);
	}
}
		
	
class Main
{
	public static void main(String args[])
	{
		Human h=new Human();
		h.show(18,"Female");
		h.display();
		Student s=new Student();
		s.show1("Aparna",75);
		s.display1();
		Developer d=new Developer();
		d.show("Vinitha","Developer","Banglre");
		d.display();
	}
}