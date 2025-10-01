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
		    int[] arr = new int[n];
		    for(int i=0; i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    int count =0;
		    
		    for(int i=0;i<n;i++){
		        for(int j = i+1;j<n;j++){
		            int sum = arr[i] + arr[j];
		            if(isPrime(sum)){
		                count++;
		            }
		        }
		    }
		    System.out.println(count);
		}

	}
	public static boolean isPrime(int n){
	    if(n <= 1) return false;
	    
	    if(n==2 || n== 3 || n== 5){
	        return true;
	    }
	    return false;
	}
}
