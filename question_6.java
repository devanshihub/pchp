import java.util.*;

public class Main
{
    public static void main(String args[])
    {
       // Scanner obj=new Scanner(System.in);
        int arr[]={3,4,2,9,6,10};

      // int n=obj.nextInt();
        int big_num=arr[0];
            for(int i=0;i<6;i++)
            {
                  if(big_num<arr[i])
                  {
                    big_num=arr[i];
                  }
                    arr[i]=big_num;
                  
            }
            for(int i=0;i<6;i++)
            {
                System.out.print(arr[i]+" ");
            }

    }
}
