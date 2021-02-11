package sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InsertionSortEasyTest {

	@Test
	void test() {

		int[] testArray2 = { 5, 2, 3, 1, 7, 2 };
		InsertionSort.insertionSort(testArray2);
		System.out.println();
		for (int element : testArray2) {
			System.out.print(element);
		}
	}

}
