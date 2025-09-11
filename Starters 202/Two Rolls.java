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
		while(t-- >0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int ned = 50 -x;
		    int min = 2*y;
		    int max =2*y + 10;
		    
		    if(ned >=min && ned<=max){
		        System.out.println("Yes");
		    }else System.out.println("No");
		}
		

	}
}
