package sorting;

public class InsertionSort {

	static void insert(int[] arr, int n, int v){
		
		for(int i=0;i<n;i++) {
			if(arr[i]>v) {
				shiftRight(arr,i, n);
				arr[i] = v;
				i = arr.length;
			}
		}
	}
	// Nested loops dan wel, wel geen volledig
	static void shiftRight(int[] arr, int index, int stop) {
		// Geheugen inefficiënt
		int[] copiedArr = new int[arr.length];
		System.arraycopy(arr, 0, copiedArr, 0, arr.length);
		for(int i = index;i<stop;i++) {
			arr[i+1] = copiedArr[i];
		}
	}
	
	static void insertionSort(int[] arr ) {
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]<arr[j]) {
					insert(arr,i,arr[i]);
					// Zorgt wel voor onodige loop
				}
			}
		}
	}

}
