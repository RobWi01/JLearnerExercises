
public class Vector {
	int x;
	int y;

	static void setx(Vector vector, int xwaarde) {
		vector.x = xwaarde;
	}
	
	static void sety(Vector vector, int ywaarde) {
		vector.y = ywaarde;
	}


	static int getx(Vector vector) {
		return vector.x;
	}

	static int gety(Vector vector) {
		return vector.y;
	}
// I suppose that we use norm 2
	static int getSize(Vector vector) {
		int x = getx(vector);
		int y = gety(vector);
		int limit = x*x + y*y;

		int z = 0;
		int product = 0;
		while (product < limit) {
			z++;
			product = z * z;
		}
		if (product != limit) {
			return z - 1;
		}
		return z;
	}
	
	static boolean compareSize(Vector vector1, Vector vector2) {
		if (getSize(vector1)>getSize(vector2)) {
			return true;
		}
		
		else {
			return false; 
		}
	}
	
	static Vector sum2Vectors(Vector vector1, Vector vector2) {
		Vector vectornew = new Vector();
		setx(vectornew, getx(vector1) + getx(vector2));
		sety(vectornew, gety(vector1) + gety(vector2));
		
		return vectornew;
	}

	static void shift(Vector vector1, Vector vector2) {
		setx(vector1,getx(vector1) + getx(vector2));
		sety(vector1,gety(vector1) + gety(vector2));
	}
}
