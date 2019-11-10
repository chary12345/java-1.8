package com.predicate;

public class CharacterCountInString {

	 static final int MAX_CHAR = 200;

	public static void main(String[] args) {
		
		
		String s = "srinu anna task";
		
		int count[] = new int[MAX_CHAR]; 
		int l = s.length(); 
		
		
		//intialize count array Index
		for (int i = 0; i < l; i++) {
            count[s.charAt(i)]++; 
		/*for (int i : count) {
			count[s.charAt(i)]++;*/
		}
  
		
		//create an array of given to string size
		char ch[] = new char[s.length()];
		System.out.println("given string is :"+s);
		for (int i = 0; i < l; i++) {
	//	for (char i : ch) {
			
		
			ch[i] = s.charAt(i); 
			
			int k = 0;
			
			for(int j=0; j<=i; j++){
				if(s.charAt(i) == ch[j])
					k++;
			}
			
			if(k == 1)
				System.out.println("Number of times repeated character "+s.charAt(i) +" is :"+count[s.charAt(i)]);
		}
		
	}
}
