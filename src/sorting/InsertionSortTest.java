package sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InsertionSortTest {

	@Test
	void test() {
		
		int[] testArray1 = {1,2,3,5,7,8};
        for (int element: testArray1) {
            System.out.print(element);
        }
		InsertionSort.insert(testArray1,5,6);
		System.out.println();
        for (int element: testArray1) {
            System.out.print(element);
        }
        
        int[] testArray2 = {5,2,3,1,7,2};
		InsertionSort.insertionSort(testArray2);
		System.out.println();
        for (int element: testArray2) {
            System.out.print(element);
        }
	}

}
