/*1.Write a Java program that compares two wrapper objects 
for equality and demonstrates 
when to use equals() instead of == (try with Integer or Float classes)*/

package assignment4;

public class CompareString {
	public static void main(String[] args) {
		Integer a = new Integer(55);
		Float b = new Float(45.88f);
		System.out.println("Objects are not equals :" + a.equals(b));
		System.out.println("objects are equals :" + a.equals(a));
	}
}