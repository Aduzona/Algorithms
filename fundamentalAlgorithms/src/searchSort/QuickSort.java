package searchSort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] arr= {5,3,1,9,2,2,6,8,7,5};   //{4,3,1,9,2,10,6,8,7,5};
qsort(arr,0,arr.length-1);
		
	}

	public static int partitionN (int[] arr, int first, int last) {
		int pivot = arr[last], temp = 0;        //pivot    
		int i = first;                       //index going left to right    
		int j = last;                        //index going right to left    
		
		while(i<j) {
			for(i=first; i<j;i++) {
				System.out.println("Array at i "+i+Arrays.toString(arr));
				if(arr[i]>pivot) {
					System.out.println("when Arr i>pivot "+i+Arrays.toString(arr));
					while(j!=i) {
						
						if(arr[j]<=pivot) {
							System.out.println("when Arr j<pivot "+j+Arrays.toString(arr));
							temp = arr[i]; 
							arr[i] = arr[j]; 
							arr[j] = temp; //swap
						}
						j--;
						break;
					}
					
				}
			}
		}
		System.out.println("Array after Swap "+Arrays.toString(arr));
		System.out.println("Position of i is "+i);
		return i;
	}
	public static void qsort(int[] arr, int first, int last) {  
		int split = partitionN(arr, first, last);     
		if (first < split - 1)      
			qsort(arr, first, split - 1);        //left subarray    
		if (split < last)      
			qsort(arr, split, last);             //right subarray 
		}
	}
		

