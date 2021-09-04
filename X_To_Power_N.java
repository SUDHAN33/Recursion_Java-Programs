package recursion;
import java.util.*;
public class X_To_Power_N {
	
	//Difficulty level : Easy.
	//Problem statement :Write a program to find x to the power n (i.e. x^n). 
	//Take x and n from the user. You need to return the answer.
	//Do this recursively.
	
	public static int Power(int x, int n) {
		if(n == 1) {
			return x;
		}
		return x*Power(x,n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Enter base term
		int x = sc.nextInt();
		//Enter power term
		int n = sc.nextInt();
		// Print the power term
		System.out.println(Power(x,n));
	}

}
