class Main 
{
      public static void main(String args[]) 
  {
        int a=22;
        int arr[]=new int[32];
        int i=31;

        while(a>0)
        {
          int r=a%2;
          arr[i]=r;
          a=a/2;
          i--;
        }
        for(int k:arr)
        {
          System.out.print(k+" ");
        }
    }
  }
