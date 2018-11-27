package searchSort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,3,1,9,2,2,6,8,7,5};
		mergeSort (arr);
	}

	public static void mergeSort (int [] arr) {   
		int na = arr.length / 2;   
		int nb = arr.length - na;      // mind integer division    
		int [] arrLeft = new int[na];     // split c: copy parts   
		for ( int i = 0; i < na; i++)
			arrLeft[i] = arr[i];    
		int [] arrRight = new int[nb];   
		for ( int j = 0; j < nb; j++) 
			arrRight[j] = arr[j+na];   
		if (arrLeft.length > 1) 
			mergeSort (arrLeft);    // recursive sort   
		if (arrRight.length > 1) 
			mergeSort (arrRight);     
		
		System.out.println(Arrays.toString(arr));
		merge (arrLeft,arrRight,arr); // merge  
		}
	/*static void merge (int [] arrLeft, int [] arrRight, int [] arr) { 
		int i = 0;         //index subarray arrLeft   
		int j = 0;         //index subarray arrRight   
		int k = 0;         //index array arr   
		for ( k = 0; k < arr.length; k++) {       
			if      (i >= arrLeft.length )      
				arr[k] = arrRight[j++];      
			else if (j >= arrRight.length )     
				arr[k] = arrLeft[i++];      
			else if (arrLeft[i] <= arrRight[j]) 
				arr[k] = arrLeft[i++];      
			else         
				arr[k] = arrRight[j++];   
			}
		}
		*/
	static void merge (int [] arrLeft, int [] arrRight, int [] arr) { 
		int i = 0;         //index subarray arrLeft   
		int j = 0;         //index subarray arrRight   
		int k = 0;         //index array arr   
		for ( k = 0; k < arr.length; k++) {  
			if (i < arrLeft.length-1) {
				arr[k]=arrLeft[i++];
			}else if(j< arrRight.length-1) {
				arr[k]=arrRight[j++];
			}else if (arrLeft[i] <= arrRight[j]) 
				arr[k] = arrLeft[i++];      
			else         
				arr[k] = arrRight[j++];   
			}
				
		}
	}
