package com.reachrk;

public class Palindrome {

	public static void main(String[] args) {
		isPalindrome(-1331);

	}
	public static boolean isPalindrome(int x) {
        boolean palindrome=false;
        int previousVal=x;
        int afterVal=0;
        int y=0;
            while(Math.abs(x)>=1 && previousVal>0) {              
                y=x%10;
                afterVal=afterVal*10+y;
                x=x/10;
            }
            if(previousVal==afterVal) {
            	palindrome=true;
            	 System.out.println(afterVal);
            }     
        return palindrome;
    }

}
