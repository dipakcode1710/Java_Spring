@FunctionalInterface
interface New
{
    int add(int i,int j);
}

public class Lambda{
    public static void main(String a[])
    {
        New Obj = (i,j) -> i+j;

        int result = Obj.add(5,10);
        System.out.println(result);
    }
}