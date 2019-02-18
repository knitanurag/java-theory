package com.anurag.jth.searching;

import java.util.Arrays;

public class BinarySearchExample {
	public static void main(String[] args) {
		int arr[] = {10, 20, 80, 30, 60, 50, 
                110, 100, 130, 170};
		int searchItem = 110;
		//need sorted arra
		Arrays.sort(arr);
		//binarySearch(arr, searchItem);
		binarySearchRecursonExample(arr,searchItem);
	}

	private static void binarySearchRecursonExample(int[] arr, int searchItem) {
		int index = recursiveBinarySearch(arr, searchItem, 0, arr.length-1);
		if(index == -1) {
			 System.out.println("Not Found");
		}else{
			System.out.println("Found at index : "+index);
		}
		
	}

	private static int recursiveBinarySearch(int[] arr, int searchItem,int firstIndex, int lastIndex) {
		if(firstIndex <= lastIndex) {
			int midIndex = (firstIndex + lastIndex) / 2;
			if(arr[midIndex] == searchItem) {
				return midIndex;
			}else if(arr[midIndex] < searchItem) {
				return recursiveBinarySearch(arr, searchItem, midIndex + 1, lastIndex);
			}else {
				return recursiveBinarySearch(arr, searchItem, midIndex - 1, lastIndex);
			}
		}
		return -1;
	}

	private static void binarySearch(int[] arr, int searchItem) {
		
		int firstIndex = 0;
		int lastIndex = arr.length-1;
		
		while(firstIndex<lastIndex){
			
			int midIndex = (firstIndex + lastIndex) / 2;
			if(arr[midIndex] == searchItem) {
				System.out.println("Found at index : "+midIndex);
				return;
			}else if(arr[midIndex] < searchItem) {
				firstIndex = midIndex + 1;
			}else {
				lastIndex = midIndex - 1;
			}
			
			 
		}
		System.out.println("Element not found.");
		
	}
}
