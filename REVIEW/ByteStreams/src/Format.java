public class Format {
	public static void main(String...args) {
		System.out.format("%f, %1$- 20.10f %n", Math.PI);

		System.out.format("%f, %<+020.10f %n", Math.PI);
	}
}
