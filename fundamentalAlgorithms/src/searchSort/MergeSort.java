package searchSort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5, 3, 4, 7, 2, 2};
		System.out.println("Initial Array :"+Arrays.toString(arr));
		mergeSort (arr);
	}
	// auxiliary function for recursive sorting by merging
		private static void _mergeSort(int a[], int copy[], int start, int end){
		
			if (start < end) {
				int mid = (start + end) / 2;
				//System.out.println("Divide :"+Arrays.toString(a));
				_mergeSort(a, copy, start, mid);
				//System.out.println("copy :"+Arrays.toString(copy));
			_mergeSort(a, copy, mid + 1, end);
			
				merge(a, copy, start, mid, end);
				//System.out.println("copy[] :"+Arrays.toString(copy));
				System.out.println("a[] :"+Arrays.toString(a));
				
			}
		}
		
		private static void merge(int a[], int copy[], int start, int m, int end) {
			int i = 0, j = start, k;
			while (j <= m)
				copy[i++] = a[j++];
			i = 0;
			k = start;
			while (k < j && j <= end) {
				if (copy[i] <= a[j])
					a[k++] = copy[i++];
				else
					a[k++] = a[j++];
			}
			while (k < j)
				a[k++] = copy[i++];
		}
		    
		public static  void mergeSort(int[] a) {
			_mergeSort(a, new int[a.length], 0, a.length - 1);
		}
		
}