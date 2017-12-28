package chapter4;

public class Exercise3 {
	public static void main(String[] args) {
		// We will be given the coordinates of the four cities and compute the area
		// of the polygon that is formed by these points
		double xAtlanta = 33.7489954;
		double yAtlanta = -843879824;
		double xCharlotte = 35.2270869;
		double yCharlotte = -80.8431267;
		double xSavannah = 32.0835407;
		double ySavannah = -81.0998342;
		double xOrlando = 28.5383355;
		double yOrlando = -81.3792365;
		
		final double EARTH_RADIUS = 6371.01;
		
		// 1. Convert the units to radians
		xAtlanta = Math.toRadians(xAtlanta);
		yAtlanta = Math.toRadians(yAtlanta);
		xCharlotte = Math.toRadians(xCharlotte);
		yCharlotte = Math.toRadians(yCharlotte);
		xSavannah = Math.toRadians(xSavannah);
		ySavannah = Math.toRadians(ySavannah);
		xOrlando = Math.toRadians(xOrlando);
		yOrlando = Math.toRadians(yOrlando);
		
		// 2. Calculate the distances between the cities and form two triangles
		double dAC = EARTH_RADIUS * Math.acos(Math.sin(xAtlanta) * Math.sin(xCharlotte) + 
				Math.cos(xAtlanta) * Math.cos(xCharlotte) * Math.cos(yAtlanta - yCharlotte));
		
		double dCS = EARTH_RADIUS * Math.acos(Math.sin(xCharlotte) * Math.sin(xSavannah) + 
				Math.cos(xCharlotte) * Math.cos(xSavannah) *Math.cos(yCharlotte - ySavannah));
		
		double dSO = EARTH_RADIUS * Math.acos(Math.sin(xSavannah) * Math.sin(xOrlando) + 
				Math.cos(xSavannah) * Math.cos(xOrlando) * Math.cos(ySavannah - yOrlando));
		
		double dOA = EARTH_RADIUS * Math.acos(Math.sin(xOrlando) * Math.sin(xAtlanta) +
				Math.cos(xOrlando) * Math.cos(xAtlanta) * Math.cos(yOrlando - yAtlanta));
		
		double dSA = EARTH_RADIUS * Math.acos(Math.sin(xSavannah) * Math.sin(xAtlanta) + 
				Math.cos(xSavannah) * Math.cos(xAtlanta) * Math.cos(ySavannah - yAtlanta));
		
		// 3. Calculate the area of the first triangle formed on the points Atlanta, Charlotte, Savannah
		double s1 = (dAC + dCS + dSA) / 2;
		double area1 = Math.pow((s1 * (s1 - dAC) * (s1 - dCS) * (s1 - dSA)), 0.5);
		
		//4. Calculate teh area of the second triangle formed on the points Atlanta, Savannah, Orlando
		double s2 = (dSA + dSO + dOA) / 2;
		double area2 = Math.pow((s2 * (s2 - dSA) * (s2 - dSO) * (s2 - dOA)), 0.5);
		
		//5. Add the two areas and print the result
		double area = area1 + area2;
		System.out.print("The total area formed from the polygon at the points Atlanta, Charlotte,"
				+ "Savannah and Orlando is " + area +  " km square");
	}
}
