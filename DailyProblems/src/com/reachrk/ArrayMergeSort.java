package com.reachrk;

public class ArrayMergeSort {
	//Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
	//The number of elements initialized in nums1 and nums2 are m and n respectively. 
	//You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.
	
	//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
	//Output: [1,2,2,3,5,6]
					
	public static void main(String[] args) {
		int[] nums1= {-1,0,0,3,3,3,0,0,0};
		int[] nums2= {1,2,2};
		merge(nums1,6,nums2,3);
	}
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
	        int mergedArr[]=new int[m+n];
	        int s1=0;
	        int s2=0;
	        
	        for(int i=0;i<m+n;i++) {
	        	if(nums2.length==0) {
	        		mergedArr[i]=nums1[s1];
	        		s1++;
	        	} else if(nums1.length==0) {
	        		mergedArr[i]=nums1[s2];
	        		s2++;
	        	} else if (s2>=nums2.length) {
	        		mergedArr[i]=nums1[s1];
	        		s1++;
	        	} else if (s1>=nums1.length) {
	        		mergedArr[i]=nums1[s2];
	        		s2++;
	        	} else if(nums1[s1]<=nums2[s2] && s1<m) {
	        		mergedArr[i]=nums1[s1];
		            s1++;
		        } else {
	        		mergedArr[i]=nums2[s2];
		            s2++;
	        	}	       
	        }
	        for(int i=0; i<m+n;i++) {
	        	nums1[i]=mergedArr[i];
	        	System.out.println(nums1[i]);
	        }
	    }   
}
