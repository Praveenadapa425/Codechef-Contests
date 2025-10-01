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
		    int n = sc.nextInt(),a = sc.nextInt();
		    
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		        
		    }
		    
		    Arrays.sort(arr);
		    
		    long ans = 0;
		    for(int i=0;i<a;i++){
		        ans += arr[n - 1 -i];
		    }
		    
		    System.out.println(ans);
		}

	}
}
