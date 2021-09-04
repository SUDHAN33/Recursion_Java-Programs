package recursion;
import java.util.*;
public class Number_of_digits {
	
	//Difficulty level : Easy.
	//Problem statement:Given the code to find out and return the number of digits present in a number recursively. 
	//Do this recursively.
	
	
	//Algorithm to find Number of digits.
	public static int No_of_Digits(int n, int b){
		if(n == 0) {
			return b;
		}
		if( n/10 != 0) {
			b++;
			
		}
		n=n/10;
	   int ans = No_of_Digits(n,b);
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b=1;
		
		//Enter number
		int n = sc.nextInt();
		System.out.println(No_of_Digits(n,b));
	}

}
