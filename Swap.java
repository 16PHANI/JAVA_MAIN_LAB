import java.util.*;
class Swap_logic
{
    int a, b;
    void cbv(int a, int b)
    {
        System.out.println("Before swapping apples Jerry has " + a + " and Tom has " + b);
        int t;
        t = a;
        a = b;
        b = t;
        System.out.println("After swapping apples Jerry has " + a + " and Tom has " + b);
    }
    void cbr(Swap_logic obj)
    {
        System.out.println("Before swapping apples Jerry has " + obj.a + " and Tom has " + obj.b);
        int t;
        t = obj.a;
        obj.a = obj.b;
        obj.b = t;
        System.out.println("After swapping apples Jerry has " + obj.a + " and Tom has " + obj.b);
    }
}
public class Swap
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int jerry, tom;
        System.out.println("Call by value: \n");
        System.out.println("Enter apples for Jerry and Tom: ");
        jerry = s.nextInt();
        tom = s.nextInt();
        Swap_logic obj = new Swap_logic();
        obj.cbv(jerry, tom);
        System.out.println("Call by reference: \n");
        System.out.println("Enter apples for Jerry and Tom: ");
        obj.a = s.nextInt();
        obj.b = s.nextInt();
        obj.cbr(obj);
        s.close();
    }
}
