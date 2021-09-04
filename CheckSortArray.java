package recursion;
import java.util.*;
public class CheckSortArray {
	
	//Difficulty level : Medium.
    //Problem statement :given is the code check whether the array is sorted recursively. 
	//Do this recursively.
	
    //Algorithm 1
	public static boolean checkSort(int[] input) {
		if (input.length <= 1) {
			return true;
		}
		int small[] = new int [input.length - 1];
		for(int i=1;i<input.length;i++) {
			small[i-1] = input[i];
		}
		boolean ans = checkSort(small);
		if(!ans) {
			return false;
		}
		if(input[0] <=input[1]) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Algorithm 2
	// Faster than Algorithm 1
	public static boolean checkSort2(int input[]) {
		if (input.length <= 1) {
			return true;
		}
		if(input[0] >input[1]) {
			return false;
		}
		int small[] = new int [input.length - 1];
		for(int i=1;i<input.length;i++) {
			small[i-1] = input[i];
		}
		boolean ans = checkSort2(small);
		return ans;
	}
	
	//Algorithm 3
	// Better checking sort algorithm
	private static boolean checkSortBetter(int input[],int startindex) {
		if (startindex >= input.length-1) {
			return true;
		}
		if(input[startindex] >input[startindex+1]) {
			return false;
		}
		boolean ans = checkSortBetter(input,startindex+1);
		return ans;
	}
	public static boolean checkSortBetter(int input[]) {
		return checkSortBetter( input,0);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(checkSortBetter(a));
		System.out.println(checkSort2(a));
		System.out.println(checkSort(a));

	}

}
