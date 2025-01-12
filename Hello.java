// Encapsulation 
class Human
{
    private int age = 11;
    private String name= "Dipak";

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }
}


public class Hello{
    public static void main(String a[])
    {
        Human obj = new Human();
        
        String n = obj.getName();
        int b = obj.getAge();

        System.out.println(n + " : " + b );
    }
}