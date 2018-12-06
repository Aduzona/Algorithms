package searchSort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] arr= {5, 3, 4, 8, 7, 1, 2};//{4, 3, 1, 9, 2, 10, 6, 8, 7, 5};

qsort(arr,0,arr.length-1);
		
	}

	public static int partitionN (int[] arr, int first, int last) {
		int pivot = arr[last], temp = 0;        //pivot    
		int i = first;                       //index going left to right    
		int j = last; //index going right to left   
		int partition;
		
		partition=i-1;
		if (first < partition)
			System.out.println("Pivot "+partition);
			   
		if (i < last)      
			System.out.println("Pivot "+last);
		while(i<j) {
			while(arr[i]<pivot&&i<arr.length) {
				i++;
				System.out.println("position at i is "+i+Arrays.toString(arr));
			}
				
			if(i<j) {
				System.out.println(arr[i]+" is >= "+pivot+Arrays.toString(arr));
				temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; //swap
				System.out.println("Swap "+arr[i]+" with "+arr[j]+Arrays.toString(arr));
			}
				while(arr[j]>=pivot&& j>i) {
						j--;
						System.out.println("position at j is "+j+Arrays.toString(arr));
					}
						if(i<j) {
							System.out.println(arr[j]+" is < "+pivot+Arrays.toString(arr));
							temp = arr[i]; 
							arr[i] = arr[j]; 
							arr[j] = temp; //swap
							System.out.println("Swap "+arr[i]+" with "+arr[j]+Arrays.toString(arr));
						}
						
						
						
					//}
		
		System.out.println("Array after Swap "+Arrays.toString(arr));
		//System.out.println("Position of i is "+i+Arrays.toString(arr));
		
				}
		
			
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
		

