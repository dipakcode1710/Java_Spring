// Anonymous class with abstract 
abstract class Outer
{
    abstract public void show();
    abstract public void hide();

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
            @Override
            public void hide()
            {
                System.out.println("in method hide");
            }
        };
        out.show();
        out.hide();
    }
}

//Output : in Class Inner
//         in method hide
