// sum of digits of a number
import java.util.Scanner;
class Main
{
    public static void main(String k[])
    {
        Scanner ob=new Scanner (System.in);
        System.out.print("\nenter a number : ");
        int n=ob.nextInt();
        int r=0,sum_of_digits=0;
        while(n>0)
        {
              r=n%10;
              sum_of_digits=sum_of_digits+r;
              n=n/10;
        }

        System.out.print("\nsum of digits  is  "+sum_of_digits);

    }
}
