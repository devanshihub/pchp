import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("\nenter a number :");
        int num=obj.nextInt();
            while(num>9)
            {
                int n=num;
                int sum=0;
                while(n>0)
                {
                      int r=n%10;
                      n=n/10;
                      sum=sum+r;
                      //System.out.println(r);
                }
                num=sum;
            }

            System.out.print("\nyour answer is  "+num);
    }
}
