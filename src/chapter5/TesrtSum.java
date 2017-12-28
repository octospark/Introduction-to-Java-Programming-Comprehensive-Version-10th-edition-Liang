package chapter5;

public class TesrtSum {
	public static void main(String[] args) {
		float sum = 0;
		
		for (float i = 0.01f; i <= 1.0f; i += 0.01f)
			sum += i;
		System.out.println(sum);
	}
}
