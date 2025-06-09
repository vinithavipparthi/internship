abstract class Car
{
    public abstract void drive();
    public void playMusic()
    {
        System.out.println("Music is playing");
    }
}
class ElectricCar extends Car
{
    public void drive()
    {
        System.out.println("Electric car is driving");
    }
    public void charge()
    {
        System.out.println("we should charge the car daily");
    }
}
class AbstractExample
{
    public static void main(String args[])
    {
        ElectricCar e=new ElectricCar();
        e.playMusic();
        e.drive();
        e.charge();
    }
}