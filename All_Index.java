package recursion;
import java.util.*;
public class All_Index {

	//Difficulty Level: Medium.
	//Problem Statement:Given an array of length N and an integer x, 
	//you need to find all the indexes where x is present in the input array.
	//Do this recursively. Indexing in the array starts from 0.
	
	//Algorithm
	private static void AllIndex(int a[],int startindex,int x) {
		if(a[startindex] == x) {
			System.out.print(startindex+" ");
		}
		if(startindex < a.length-1) {
			AllIndex(a,startindex+1,x);
		}
		
	}
	public static void AllIndex(int a[],int x) {
		 AllIndex(a,0,x);
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
		//Enter the number to find its All index
		int x = sc.nextInt();
		AllIndex(a,x);
	}
}
