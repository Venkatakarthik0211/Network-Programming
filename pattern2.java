import java.util.*;
class pattern2
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        {
            int n = in.nextInt(); 
            for(int i = n; i>=1; i--)
            {
                for(int j=i;j>=1; j--) 
                {
                    System.out.print("*"); 
                }
                for(int j = 1; j<=2*(n-i); j++)
                {
                  System.out.print(" ");
                }
                for(int j=i;j>=1; j--) 
                {
                    System.out.print("*"); 
                }
                System.out.println();
            }
            
            for(int i = 1; i<=n; i++)
            {
                for(int j=i;j>=1; j--) 
                {
                    System.out.print("*"); 
                }
                for(int j = 1; j<=2*(n-i); j++)
                {
                  System.out.print(" ");
                }
                for(int j=i;j>=1; j--) 
                {
                    System.out.print("*"); 
                }
                System.out.println();
            }
            
        }
    }
}
