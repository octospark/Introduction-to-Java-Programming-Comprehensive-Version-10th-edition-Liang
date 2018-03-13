package chapter13;

/**
 * @author Erlin Goce
 *
 * Mar 13, 2018 4:38:28 PM
 */
public class House implements Cloneable, Comparable<House> {
	public static void main(String[] args) throws CloneNotSupportedException {
		House house1 = new House(1, 1750.50);
		House house2 = (House)(house1.clone());
		System.out.println(house1.equals(house2));
	}
	private int id;
	private double area;
	private java.util.Date whenBuilt;
	
	public House(int id, double area) {
		this.id = id;
		this.area = area;
		whenBuilt = new java.util.Date();
	}

	public int getId() {
		return id;
	}

	public double getArea() {
		return area;
	}

	public java.util.Date getWhenBuilt() {
		return whenBuilt;
	}
	
	@Override /** Override the protected clone method defined in the Object Class
	and strengthen its accessibility */
	public Object clone() throws CloneNotSupportedException{
		// Perform a shallow copy
		House houseClone = (House)super.clone();
		// Deep copy on whenBuilt
		houseClone.whenBuilt = (java.util.Date)(whenBuilt.clone());
		return houseClone;
	}
	
	@Override // Implement the compareTo method defined in Comparable
	public int compareTo(House o) {
		if (area > o.area)
			return 1;
		else if (area < o.area)
			return -1;
		else
			return 0;
	}
	
	public boolean equals(House o) {
		if (compareTo(o) == 0)
			return true;
		return false;
	}
}
