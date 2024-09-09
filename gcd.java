// GCD using recursion (greatest common divisior)
class Main
{
    public static void main(String[] args)
    {
         int a=9;
         int b=12;
         int g=gcd(a,b);
         System.out.println(g);
    }
   static int gcd(int a,int b)
    {
        if (a==0)
           return b;
        else
        {
            int c=a;
            a=b%a;
            b=c;
            return gcd(a,b);
        }
        
    }
    
}
