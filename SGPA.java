import java.util.*;
public class SGPA
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        double sgpa=0,sum=0;
        int gp=0;
        String Subjects[]={"Graphics","PPS","JAVA","Chemistry","English","Technical Skills","Data Structures"};
        double cp[]={2,4,3,3,2,1.5,4};
        for(int i=0;i<Subjects.length;i++)
        {
            System.out.println("Enter "+Subjects[i]+" Subject Grade : ");
            String n=s.next();
            switch(n)
            {
                case "A+":
                            gp=10;
                            break;
                case "A":
                            gp=9;
                            break;
                case "B":
                            gp=8;
                            break;
                case "C":
                            gp=7;
                            break;
                case "D":
                            gp=6;
                            break;
                case "E":
                            gp=5;
                            break;
                case "F":
                            gp=0;
                            break;
                default:
                            System.out.println("Wrong Grade");
                            i--;
                            break;
            }
            if(gp==0)
            {
                break;
            }
            else
            {
                sgpa=sgpa+gp*cp[i];
                sum=sum+cp[i];
            }
        }
        if(gp==0)
        {
            System.out.println("Student Failed in Exam,No SGPA");
        }
        else
        {
            System.out.println("SGPA is : "+String.format("%f",(sgpa/sum)));
        }
        s.close();
    }
}
