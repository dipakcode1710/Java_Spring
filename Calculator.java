public class Calculator{
    public static void main(String a[])
    {
        Div ad = new Div();
        int r1 = ad.add(4 , 5);
        int r2 = ad.sub(10 , 5);
        int r3 = ad.Div(4 , 2);
        int r4 = ad.mult(4 , 5);
        System.out.println("Addition :" + r1);
        System.out.println("Substraction :" +r2);
        System.out.println("Division :" +r3);
        System.out.println("Multiplication :" +r4);
    }
}