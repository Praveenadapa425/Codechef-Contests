import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-- > 0){
		    int x = sc.nextInt();
		    int min = 1000;
		    
            for(int k=0;k<=x/3 ; k++){
                int rem = x - 3*k;
                
                if(rem >=0 && rem %2 ==0){
                    int  l = rem /2;
                    int cost = 4*l + 5*k;
                    min = Math.min(min,cost);
                }
            }
            System.out.println(min);
		}

	}
}
