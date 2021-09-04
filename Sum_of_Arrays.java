package recursion;
import java.util.*;
public class Sum_of_Arrays {

	//Difficulty Level: EASY
	//Problem statement: Given an array of length N, you need to find and return the sum of all elements of the array.
    //Do this recursively. 
	
	//Algorithm to find sum of arrays
	public static int Sum(int a[],int n) {
		if(n == 0) {
			return a[0];
		}
		return a[n]+Sum(a,n-1);
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
		System.out.println(Sum(a,n-1));

	}

}
