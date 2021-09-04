package recursion;
import java.util.*;
public class First_Index {
	
	//Difficulty Level: Medium.
	//Problem Statement: Given an array of length N and an integer x, you need to find and 
	//return the first index of integer x present in the array. Return -1 if it is not present in the array.
	//First index means, the index of first occurrence of x in the input array.
	//Do this recursively. Indexing in the array starts from 0.
	
	//Algorithm
    private static int FirstIndex(int a[], int startindex, int x) {
    	if(a[startindex] == x) {
    		return startindex;
    	}
    	else if(startindex<a.length-1) {
    	int ans = FirstIndex( a, startindex+1, x);
    	return ans;
    	}
    	else {
    		return -1;
    	}
    	
    }
    public static int FirstIndex(int a[], int x) {
    	return FirstIndex(a,0,x);
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
		//Enter the number to find its first index
		int x = sc.nextInt();
		System.out.println(FirstIndex(a,x));
	}

}
