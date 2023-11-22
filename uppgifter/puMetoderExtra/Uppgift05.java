package puMetoderExtra;

public class Uppgift05 {

	public static void main(String[] args) {
		int[] point1 = {4, 5};
		int[] point2 = {6, 7};
		System.out.println(distanceBetween(point1, point2));

	}
	
	static public double distanceBetween(int[] point1, int[] point2) {
		int distanceX = point1[0] - point2[0];
		int distanceY = point1[1] - point2[1];
		
		double distance = Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));
		return distance;
	}

	static public double distanceBetween(double[] point1, double[] point2) {
		double distanceX = point1[0] - point2[0];
		double distanceY = point1[1] - point2[1];
		
		double distance = Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));
		return distance;
	}
	
}
