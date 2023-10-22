package com.assingment;



public class Pangram {

	public static void main(String[] args) {

  String str = "The quick brown fox jumps over the lazy dog ";
   String str1 = str.toLowerCase();
   int count=0;

	if(str1.length()<26) {
		System.out.println("Not a Pangram");
	}
	
	else {
		
		for(char ch='a';ch<='z';ch++) {
			
			if(str1.indexOf(ch)<0) {
				System.out.println("Not a Pangram");
				break;
			}
			
			count++;
			
		
		}
		
		}
	 if(count>=26) {
	System.out.println("pangram sentence");
		
	}
}

}
