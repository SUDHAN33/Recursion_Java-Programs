package recursion;
import java.util.*;
public class Check_Number {
	
	//Difficulty Level: Easy.
	//Problem Statement:Given an array of length N and an integer x, 
	//you need to find if x is present in the array or not. Return true or false.
	//Do this recursively. 
	
	//Algorithm 
	public static boolean Find(int a[],int x,int n) {
		if(x == a[n] ) {
			return true;
		}
		else if(n>0) {
			boolean ans = Find(a,x,n-1);
		    return ans;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Enter array size
		int n = sc.nextInt();
		int a[] = new int[n];
		//Enter array elements
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		//Enter the number to find
		int x = sc.nextInt();
		System.out.println(Find(a,x,n-1));

	}

}
