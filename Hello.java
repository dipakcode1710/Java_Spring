// Encapsulation 
class Human
{
    private int age;
    private String name;

    // Construstor is a special method.
    // It has same name as class name.
    // Construstor never return anything.
    // Every time we will create an object it will call construstor
    public Human()
    {
        // System.out.println("In construstor");
        age = 11;
        name= "Pradip";
    }
    
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
        Human obj1 = new Human();
        
       //obj.setName("Kavita");
        //obj.setAge(42);
        String n = obj.getName();
        int b = obj.getAge();
        
        System.out.println(n + " : " + b );
    }
}