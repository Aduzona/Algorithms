package searchSort;

import java.util.Arrays;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr={5, 3, 4, 8, 7, 2, 2};
    insertionSort(arr);
    //insertionSortLecture (arr);
	}

	public static void insertionSort (int[] arr) {    
		int n = arr.length;    
		System.out.println("Initial Array "+"0 "+Arrays.toString(arr));
		for (int i = 1; i < n; i++) {    
			int toInsert = arr[i];  
			for (int j = i; j > 0; j--) {  
				if(toInsert<arr[j-1]) {
					System.out.println(arr[j]+" at position "+j+" is less than "+arr[j-1]+Arrays.toString(arr));
					arr[j] = arr[j-1];  
					arr[j-1] = toInsert; 
					//System.out.println("iteration "+i+" "+Arrays.toString(arr));
				}
				
				}     
			}
		System.out.println("Sorted Array "+Arrays.toString(arr));
		}
	public static void insertionSortLecture (int[] arr) {    
		int n = arr.length;   
		int toInsert;
		int j;
		System.out.println("Initial Array "+Arrays.toString(arr));
		for (int i = 1; i < n; i++) {    
			 toInsert = arr[i]; 
			for (j = i; toInsert < arr[j-1]; j--) {    
				System.out.println(arr[i]+" is less than "+arr[j-1]+Arrays.toString(arr));
				arr[j] = arr[j-1]; 
				arr[j] = toInsert;
				}     
			}        
		System.out.println("Lectures Sorted Array After my correction "+Arrays.toString(arr));
		}
}
