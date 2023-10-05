//import java.io.*;
import java.util.*;
//import java.lang.*;
public class LuckyNum
{
    public static void main(String args[])
    {
        int i, n;
        System.out.println("Enter no.of elements : ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        if (n >= 1 && n <= 100)
        {
            int a[] = new int[n];
            System.out.println("Enter " + n + " Elements of array : ");
            for (i = 0; i < n; i++)
            {
                a[i] = s.nextInt();
            }
            LuckyNum ln = new LuckyNum();
            ln.LuckyNumber(n, a);
        }
        else
        {
            System.out.println("User must enter valid range for size of array");
        }
        s.close(); //closing object
    }
    void LuckyNumber(int n, int a[])
    {
        int i, j, c = 0, sum = 0;
        int b[] = new int[20];
        for (i = 0; i < n; i++)
        {
            if (a[i] >= 1 && a[i] <= 1000000)
            {
                sum = 0;
                for (j = 1; j < 8; j++)
                {
                    sum += Math.pow(7, j);
                    if (a[i] == sum)
                    {
                        b[c] = a[i];
                        c++;
                        break;
                    }
                }
            }
            else
            {
                System.out.println("Out of range entered by user in array at " + i);
            }
        }
        if (c > 0)
        {
            System.out.println("Number of Lucky Numbers are : " + c);
            System.out.println("Lucky Numbers are : ");
            for (i = 0; i < c; i++)
            {
                System.out.println(" " + b[i]);
            }
        }
        else
        {
            System.out.println("No Lucky Numbers in Array");
        }
    }
}
