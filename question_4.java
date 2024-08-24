import java.util.Scanner;
class main
{
    public static void main(String k[])
    {
        Scanner ob=new Scanner (System.in);
        System.out.print("\nenter size : ");
        int n=ob.nextInt();
        int arr[]=new int[n];
        int newarray[]=new int[n];
        int sum=0;
        System.out.print("\nenter values : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
            sum=sum+arr[i];
            newarray[i]=sum;
        }
        System.out.print("\nyour new array is ; ");
        for(int b:newarray)
        System.out.print(b+" ");

    }
}