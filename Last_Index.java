package recursion;
import java.util.*;
public class Last_Index {

	//Difficulty Level: Medium.
	//Problem Statement: Given an array of length N and an integer x,you need to find 
	//and return the last index of integer x present in the array. Return -1 if it is not present in the array.
	//You should start traversing your array from 0, not from (N - 1).
	//Do this recursively. Indexing in the array starts from 0.
	
	private static int LastIndex(int a[],int endindex,int x) {
		if(a[endindex] == x ) {
			return endindex;
		}
		else if(endindex >0) {
		int ans = LastIndex(a,endindex-1,x);
		return ans;
	  }
		else {
			return -1;
		}
	
	}
	public static int LastIndex(int a[],int x) {
		return LastIndex( a, a.length-1, x);
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
		//Enter the number to find its last index
		int x = sc.nextInt();
		System.out.println(LastIndex(a,x));
				
	}

}
