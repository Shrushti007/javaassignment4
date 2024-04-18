/*Write a program to split a string containing two words 
using StringTokenizer without using hasMoreTokens() 
method and call nextToken() method three times.
Add an exception handling block if necessary*/
package assignment4;

import java.util.StringTokenizer;

public class StringToken {
	
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer(" Great day ahead ");
		try {
			String token1 = st.nextToken();
			System.out.println(token1);
			String token2 = st.nextToken();
			System.out.println(token2);
			String token3 = st.nextToken();
			System.out.println(token3);
		} catch (Exception e) {
			System.out.println("There is nothing to Show ");
			System.out.println(e.getMessage());
		}
	}

}
