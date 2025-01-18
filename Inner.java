// Anonymous class
class Outer
{
    public void show()
    {
        System.out.println("in Class Outer");
    }
}

public class Inner{
    public static void main(String a[])
    {
        // Creating an anonymous inner class that overrides the show method
        Outer out = new Outer()
        {
            @Override
            public void show()
            {
                System.out.println("in Class Inner");
            }
        };
        out.show();
    }
}

//Output : in Class Inner
