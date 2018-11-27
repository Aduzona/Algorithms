package searchSort;

import java.util.Arrays;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr={4,3,1,9,2,10,6,8,7,5};
    insertionSort(arr);
    insertionSortLecture (arr);
	}

	public static void insertionSort (int[] arr) {    
		int n = arr.length;    
		System.out.println("iteration "+"0 "+Arrays.toString(arr));
		for (int i = 1; i < n; i++) {    
			int toInsert = arr[i];  
			for (int j = i; j > 0; j--) {  
				if(toInsert<arr[j-1]) {
					arr[j] = arr[j-1];  
					arr[j-1] = toInsert; 
					System.out.println("iteration "+i+" "+Arrays.toString(arr));
				}
				
				}     
			}
		System.out.println("Sorted Array "+Arrays.toString(arr));
		}
	public static void insertionSortLecture (int[] arr) {    
		int n = arr.length;   
		int toInsert;
		int j;
		for (int i = 1; i < n; i++) {    
			 toInsert = arr[i]; 
			for (j = i; toInsert < arr[j-1]; j--) {    
				arr[j] = arr[j-1]; 
				arr[j] = toInsert;
				}     
			}        
		System.out.println("Lectures Sorted Array After my correction "+Arrays.toString(arr));
		}
}
