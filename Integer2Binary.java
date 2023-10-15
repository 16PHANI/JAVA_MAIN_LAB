import java.util.*;
public class Integer2Binary
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a integer between 1 and 255 : ");
        int n=s.nextInt();
        if(n>=1 && n<=255)
        {
            String b=String.format("%08d",Integer.valueOf(Integer.toString(n,2)));
            System.out.print("Binary Value is : "+b);
        }
        else
        {
            System.out.println("Input Entered must be between 1 and 255");
        }
        s.close();
    }
}
