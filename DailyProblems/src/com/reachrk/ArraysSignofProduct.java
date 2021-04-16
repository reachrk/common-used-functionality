package com.reachrk;

public class ArraysSignofProduct {

	public static void main(String[] args) {
		int nums[]= {1,5,0,2,-3};
		System.out.println(arraySign(nums));
	}
	
	    public static int arraySign(int[] nums) {
	        int sign=0;
	        int count=0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]<0){
	                count++;
	            }
	            else if(nums[i]==0) {
	                return 0;
	            }
	        }
	        if(count%2==0){
	            sign=1;
	        }
	        else if(count%2==1){
	            sign=-1;
	        }
	        return sign;
	    }
}
