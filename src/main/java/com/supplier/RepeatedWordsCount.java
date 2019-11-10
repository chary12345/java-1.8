package com.supplier;

import java.util.Scanner;

public class RepeatedWordsCount {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("please enter a string to find duplicates words in sentence : ");
		String input = sc.nextLine();
		String[] words = input.split("\\s");
		
		int wordcount  =1;
		//outer loop comparision
		for (int i = 0; i < words.length; i++) {
			for (int j = i+1; j < words.length; j++) {
				if(words[i].equals(words[j])){
					wordcount=wordcount+1;
					words[j]="0";
				}
				
			}
			if(words[i]!="0"){
				System.out.println(words[i] +"  "+wordcount);
				wordcount=1;
			}
			
		}
	}
	/*public static void main(String[] args)
	{
		String input="Welcome to Java Session hate you  Session Session"; 		//Input String	
		String[] words=input.split(" ");	//Split the word from String
		int wrc=1;							//Variable for getting Repeated word count
		
		for(int i=0;i<words.length;i++)		//Outer loop for Comparison		
		{
			for(int j=i+1;j<words.length;j++)	//Inner loop for Comparison
			{
				
			if(words[i].equals(words[j]))	//Checking for both strings are equal
				{
					wrc=wrc+1;				//if equal increment the count
					words[j]="0";			//Replace repeated words by zero
				}
			}
			if(words[i]!="0")
			System.out.println(words[i]+"--"+wrc);	//Printing the word along with count
			wrc=1;
			
	     }  
			
	}
*/
}