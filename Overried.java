class Math
{
    public int add(int a, int b)
    {
        return a + b;
    }
}

class Sci extends Math
{
    public int add(int a, int b)
    {
        return a + b + 5;
    }
}


public class Overried{
    public static void main(String a[])
    {
        Sci m = new Sci();
        System.out.println(m.add(5,5));

    }
}