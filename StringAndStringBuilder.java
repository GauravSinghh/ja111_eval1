package com.masai;

public class StringAndStringBuilder {

	public static void main(String[] args) {
		String s= "12345";
		String s1 ="abc";
		System.out.println(s.charAt(2)); // this method will return the char at any index
		
		System.out.println(s.compareTo(s1)); // this method will compare two strings lexicographically and return the difference;
		
		System.out.println(s.indexOf(3)); //this method will return the index of the entered element present in the string;
		
		System.out.println(s1.toUpperCase());// this method will return the new string with uppercase value;
		
		System.out.println(s1.length()); // this will return the length of the string;
		
		System.out.println(s1.replace('a', 'g'));// this method will return the new string after replacing the old char with new char
	}
}

/*String in java is immutable because if the string is immutable then the space will be less consumed and
 * will take less space. The difference between string and string builder is that String is immutable and won't be changed in any circumstances but can be reassigned or redeclared.
 * while string builder is mutable or can be changed it doesn't need to be reassigned. String can concate with other string and will return new string hence no changes will be made to the
 * particular prior string while string builder won't face any trouble as such , it can be concatenated as per the required.
 * Stringbuilder will face problems when used in multithreading because various thread can try to access it at the same time which will cause issues.
 * 
 * Examples of methods on strings are listed above:
 */
