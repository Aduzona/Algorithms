package searchSort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {5, 3, 4, 8, 7, 2, 2};
		selectionSort(a);
	}

	public static void selectionSort (int[] arr) {  
		int n = arr.length;   
		int index=0;
		System.out.println("Initial Array "+Arrays.toString(arr));
		for (int i = 0; i < n-1; i++) {                // (1)         
			int indexMin = i;    
			for ( int j = i+1; j < n; j++) {          // (2)       
				if (arr[j] < arr[indexMin]) {        
					indexMin = j;   
				}
			}
			System.out.println("Smallest is: "+arr[indexMin]+" at position "+indexMin+" "+Arrays.toString(arr));
			System.out.println("Swap: "+arr[indexMin]+" with "+arr[i]+ " "+Arrays.toString(arr));
			int temp = arr[indexMin]; 
			arr[indexMin] = arr[i]; 
			arr[i] = temp; // (3)  
			
			} 
		System.out.print("Sorting Complete: "+Arrays.toString(arr));
		}
		
}
