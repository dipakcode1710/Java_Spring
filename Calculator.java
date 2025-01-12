public class Calculator{
    public static void main(String a[])
    {
        Advancecal ad = new Advancecal();
        int r1 = ad.add(4 , 5);
        int r2 = ad.sub(10 , 5);
        int r3 = ad.Div(4 , 2);
        int r4 = ad.mult(4 , 5);
        double r5 = ad.precent(100,520);
        System.out.println("Addition :" + r1);
        System.out.println("Substraction :" +r2);
        System.out.println("Division :" +r3);
        System.out.println("Multiplication :" +r4);
        System.out.println("Precent :" +r4);
    }
}