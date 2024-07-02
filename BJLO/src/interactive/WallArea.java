package interactive;

public class WallArea {
	public static void main(String[] args) {
		/*
		 * Dimensions of the wall and number and dimensions of the windows
		 */
		int windows = 2;
		double windowHeight = 4.0;
		double windowWidth = 3.0;
		double wallWidth = 30.5;
		double wallHeight = 8.25;
		// Computation and display of the result
		double area = wallWidth * wallHeight - windows * windowWidth * windowHeight;
		System.out.println(area);


		

	}
}