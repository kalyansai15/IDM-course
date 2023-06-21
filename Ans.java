/* package codechef; // don't place package name! */
//jmkknk
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ans
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i =0;i<t;i++)
		{
		    int n =sc.nextInt();
		    String a[]=new String[n];
		    int c1=0;
		    int c2=0;
            int k =0;
		    for(int j =0;j<n;j++)
		    {
		        a[j]=sc.next();
		    }
            while(k!=n)
            {
                if(a[k].equals("START38"))
		        {
		            c1++;
		        }else
		        {
		            c2++;
		        }
                k++;
            }
		    System.out.println(c1 + " "+ c2);
		    
		}
	}
}
