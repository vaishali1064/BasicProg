package com.program;

public class VowelConsonant {

	public static void main(String[] args) {
		
		System.out.println("Enter Alphabet");
		char ch = Utility.getUserSpecificChar();
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

	}

}
