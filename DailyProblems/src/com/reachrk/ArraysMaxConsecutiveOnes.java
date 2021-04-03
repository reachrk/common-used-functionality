package com.reachrk;

import java.util.HashMap;

public class ArraysMaxConsecutiveOnes {

	public static void main(String[] args) {
		int[] nums= {0,0,1,0,1,1,1,1,0,1};
		System.out.print(findMaxConsecutiveOnes(nums));
	}
	 public static int findMaxConsecutiveOnes(int[] nums) {
		 int maxCount=0;
	        HashMap<Integer,Integer> hmap= new HashMap<Integer,Integer>();
	        for (int i=0;i<nums.length;i++){
	            if(i==0 && nums[i]==1){
	                hmap.put(nums[i],1);
	                maxCount=1;
	                System.out.println(hmap);
	            }
	            else if(nums[i]==1 && nums[i-1]==nums[i]) {
	                hmap.put(nums[i], hmap.get(nums[i])+ 1);
	                if(hmap.get(nums[i])>maxCount) {
	                	 maxCount=hmap.get(nums[i]);
	                }
	               
	                System.out.println(hmap);
	            }
	            else if(i>0 && nums[i-1]!=nums[i]) {
	            		hmap.put(nums[i], 1);
	            		 if(hmap.get(nums[i])>maxCount) {
		                	 maxCount=hmap.get(nums[i]);
		                }
	            		System.out.println(hmap);
	            }
	        }
	        System.out.println(hmap);
	        return maxCount;
	    }
}
