import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class vectorTest {

	@Test
	void test() {
		
		Vector vectorTest = new Vector();
		Vector.setx(vectorTest, 3);
		Vector.sety(vectorTest, 3);
		int output = Vector.getSize(vectorTest);
		System.out.println(output);
		
		Vector vectorTest2 = new Vector();
		Vector.setx(vectorTest2, 4);
		Vector.sety(vectorTest2, 4);
		int output2 = Vector.getSize(vectorTest2);
		System.out.println(output2);
		
		assert Vector.compareSize(vectorTest2, vectorTest) == true;
		
		Vector vectorTest3 = Vector.sum2Vectors(vectorTest, vectorTest2);
		System.out.println(Vector.getx(vectorTest3));
		System.out.println(Vector.gety(vectorTest3));
		System.out.println(vectorTest3);
		
		System.out.println(vectorTest2);
		Vector.shift(vectorTest2, vectorTest);
		System.out.println(Vector.getx(vectorTest2));
		System.out.println(Vector.gety(vectorTest2));
		System.out.println(vectorTest2);
	}

}
