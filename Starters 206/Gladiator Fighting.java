import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		while(n-- > 0){
		    int a = sc.nextInt();
		    
		    int min  = a-2;
		    if(a==2) min =0;
		    int max  = (a-2) *(a-1)  /2;
		    System.out.println(min+ " "+max);
		}

	}
}
