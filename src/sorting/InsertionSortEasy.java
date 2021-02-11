package sorting;

public class InsertionSortEasy {
	
	public void insertionSortEast(int[] arr){
		
		for(int i=1;i<arr.length;i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && key<arr[j]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				j--;
			}
		}
		
	}

}
