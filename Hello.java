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

    public void setName(String a)
    {
        name = a;
    }

    public void setAge(int n)
    {
        age = n;
    }
}


public class Hello{
    public static void main(String a[])
    {
        Human obj = new Human();
        
        obj.setName("Kavita");
        obj.setAge(42);
        String n = obj.getName();
        int b = obj.getAge();
        
        System.out.println(n + " : " + b );
    }
}