import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    int n = sc.nextInt();
		    
		    int fc = n/4;
		    int rm = n%4;
		    int cost = fc * 400;
		    
		    if(rm == 1){
		        if(fc > 0) cost = (fc - 1) * 400 + 500;
		        else cost += 200;
		    }else if(rm == 2) cost += 200;
		    else if(rm ==3)cost+=300;
		    
		    
		    System.out.println(cost);
		}

	}
}
