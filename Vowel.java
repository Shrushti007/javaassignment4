/*Write a JAVA program to create a method that takes a string as input and throws 
an exception if the string does not contain vowels*/
package assignmnet4;
import java.util.Scanner;

class NoVowels  extends Exception{
	public NoVowels(String msg) {
		super(msg);
	}
}
public class Vowel{
	public static void CheckVowels(String input) throws NoVowels {
		
	boolean containsVowels =false;
		String vowel="AEIOUaeiou";{
			for(int i=0;i<input.length();i++) {
			char test=input.charAt(i);
			if(vowel.contains(String.valueOf(test))) {
				containsVowels=true;
				break;
			}
			
		}
		if(!containsVowels) {
			throw new NoVowels ("this string does not contains any vowels");

	}
	
		}}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the string ");
		try {
			String input=sc.next();
			 CheckVowels(input);
			 System.out.println("the String contains vowels");
		}catch(Exception  e) {
			System.out.println(e.getMessage());
		}
		
		

	}

	}


