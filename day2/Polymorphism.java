class Animal
{
	public void makeSound()
	{
		System.out.println("Animal makes sound");
	}
}
class Dog extends Animal
{
	public void makeSound()
	{
		System.out.println("Dog says bow bow!!"); 
	}
}
class Cat extends Animal
{
	public void makeSound()
	{
		System.out.println("CAt says meow meowwwwww");
	}
}
class Polymorphism
{
	public static void main(String args[])
	{
		Animal a=new Animal();
		a.makeSound();
		a=new Dog();
		a.makeSound();
		a=new Cat();
		a.makeSound();
	}
}