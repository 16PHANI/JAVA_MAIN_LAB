import java.util.Scanner;
public class Alphabet
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n, i, j, c;
        System.out.print("Enter the number of characters in a String: ");
        n = s.nextInt();
        if (n >= 1 && n <= 100)
        {
            System.out.print("Enter the alphabets in lexicographical order of length: ");
            String a = s.next();
            if (a.length() == n)
            {
                char[] chr = a.toCharArray();
                for (i = 0; i < n; i++)
                {
                    c = 0;
                    for (j = i + 1; j < n; j++)
                    {
                        if (chr[i] < chr[j])
                        {
                            c = c + 1;
                        }
                    }
                    System.out.print(" " + c);
                }
            }
            else
            {
                System.out.println("Invalid input");
            }
        }
        else
        {
            System.out.println("Invalid input. Please enter a number between 1 and 100.");
        }
        s.close();
    }
}
