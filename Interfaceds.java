// interface 
interface Human
{
    public void eat();
    public void sleep();
}

class Child implements Human
{
    public void eat()
    {
        System.out.println("Human eats");
    }
    public void sleep()
    {
        System.out.println("Human sleeps");
    }
}


public class Interfaceds{
    public static void main(String a[])
    {
        Human obj;
        obj = new Child();
        obj.eat();
        obj.sleep();
    }
}
