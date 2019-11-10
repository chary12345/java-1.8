package com.supplier;

import java.util.Scanner;

public class ReverseAStringWordByWord {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string to reverse word by word :");
	//	String inputString = sc.nextLine();
		String str= sc.nextLine();
		String word = str;
		
		int countOccurence = WordOccurence.countOccurence(str, word);
		int wordCount = WordOccurence.wordCount(str);
		System.out.println("words count in string : "+wordCount);
		
		System.out.println("number of occerence words are : "+countOccurence);
		
		
		String[] words = str.split("\\s");
		String outputString = "";
		for (int i  = words.length-1; i >=0;  i--) {
			outputString = outputString+words[i]+" ";
			
		}
		System.out.println("the output is"+outputString);
	}
}
class WordOccurence{
	static int countOccurence(String str ,String word){
		String[] a = str.split(" ");
		
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if(word.equals(a[i])){
				count++;
				
			}
			
		}
		return count;
		
	}
	static int wordCount(String input){
		if(input==null||input.isEmpty()){
			
			return 0;
		}
		String[] words = input.split("\\s");
		return words.length;
	}
}