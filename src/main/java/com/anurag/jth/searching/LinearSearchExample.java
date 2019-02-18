package com.anurag.jth.searching;

public class LinearSearchExample {
	public static void main(String[] args) {
		int arr[] = {10, 20, 80, 30, 60, 50, 
                110, 100, 130, 170};
		int searchItem = 110;
		//Complexity O(n)
		//linearSearch(arr,searchItem);
		usingRecursiveLinearSearch(arr,searchItem);
		
	}

	private static void usingRecursiveLinearSearch(int[] arr, int searchItem) {

		int index = recursiveSearch(arr,searchItem,0,arr.length-1);
		if(index == -1) {
			System.out.println("Not Found");
		}else {
			System.out.println("Found at index :" + index);
		}
		
		
	}

	private static int recursiveSearch(int[] arr, int searchItem, int start, int end) {
		if(end < start) {
			return -1;
		}
			if(arr[start] == searchItem) {
				return start;
			}
			if(arr[end] < searchItem ) {
				return end;
			}
			return recursiveSearch(arr, searchItem, start+1, end-1);
		
	}

	private static void linearSearch(int[] arr, int searchItem) {
		
		for(int i =0; i< arr.length; i++) {
			if(arr[i] == searchItem) {
				System.out.println("Searched Item at index :"+i);
				return;
			}
		}
		System.out.println("Searched Item is not present.");
		
	}
}
