// Encapsulation 
class Human
{
    // private int age;
    // private String name;

    // // Construstor is a special method.
    // // It has same name as class name.
    // // Construstor never return anything.
    // // Every time we will create an object it will call construstor
    public Human()
    {
        System.out.println("Dipak");
    }

    // public Human(int age, String name) // parameterized construstor
    // {
    //     System.out.println("In construstor 2");
    //     this.age=age;
    //     this.name=name;
    // }
    
    // public int getAge()
    // {
    //     return age;
    // }

    // public String getName()
    // {
    //     return name;
    // }

    // public void setName(String a)
    // {
    //     name = a;
    // }

    // public void setAge(int n)
    // {
    //     age = n;
    // }
}

class Child extends Human
{
    public Child()
    {
        System.out.println("Pradip");
    }
}


public class Hello{
    public static void main(String a[])
    {
        // Human obj = new Human();
        Child bby = new Child();
        // Human obj1 = new Human(17,"Shubham");
        
        // obj.setName("Kavita");
        // obj.setAge(42);
        // String n = obj.getName();
        // int b = obj.getAge();
        
        // System.out.println(obj.getName() + " : " + obj.getAge() );
        // System.out.println(obj1.getName() + " : " + obj1.getAge() );
    }
}

// Name convenstion
// java use camel casing
// class and interface -  Clac,MyData --  first letted should be Capital
// Construstor - Human()
// varible and method - marks, show(), showMyMarks()
// constants - PIE, BRAND, MY_DATA
