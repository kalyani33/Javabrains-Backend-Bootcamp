package io.javabrains.javabasics;

import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String for calculating number of vowles ");
		String word = sc.next();
		word = word.toLowerCase();
		int vowlesCount = 0;
		for(int i=0;i<word.length();i++) {
			if(isVowel(word.charAt(i))) {
				vowlesCount++;
			}
		}
		System.out.println("Vowels count is :: " + vowlesCount);

	}
	public static boolean isVowel(char c) {
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		}
		return false;
	}

}
