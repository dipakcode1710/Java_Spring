//Abstraction
abstract class Car
{
    public abstract void drive();
    public void music()
    {
        System.out.println("music");
    }
}  

class Swift extends Car
{
    public void drive()
    {
        System.out.println("drive"); 
    }
}
public class Demo{
    public static void main(String a[])
    {
        Car c = new Swift();
        c.drive();
        c.music();
    }
}


