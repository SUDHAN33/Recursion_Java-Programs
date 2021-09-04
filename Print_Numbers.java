package recursion;
import java.util.*;
public class Print_Numbers {
	
	    //Difficulty level : Easy.
		//Problem statement :Given is the code to print numbers from 1 to n in increasing order recursively. 
		//Do this recursively.

	// Algorithm to print numbers recursively
	public static void Print(int n, int b) {
		int ans = n-b;
		if(b >= 0) {
		b--;
		System.out.print(ans+" ");
		Print(n,b);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Enter number
		int n = sc.nextInt();
		Print(n,n-1);

	}

}
