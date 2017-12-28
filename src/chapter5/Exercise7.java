package chapter5;

public class Exercise7 {
	public static void main(String[] args) {
		double factor = 1.05;
		double tuition = 10000;
		for (int i = 0; i < 10; i++) {
			tuition *= factor;
		}
		System.out.printf("Tuition after ten years will be $%,.2f\n",tuition);
		double total = 0;
		for (int i = 0; i < 4; i++) {
			total += tuition;
			tuition *= factor;
		}
		System.out.printf("The total cost of four years of study after ten years from now will be $%,.2f",
				total);
	}
}
