public class FizzBuzz {
	public static void main(String args[]) {
		boolean print5 = false;
		boolean print3 = false;
		for	(int i = 1; i <= 100; i++) {
			print5 = i % 5 == 0;
			print3 = i % 3 == 0;
			if (print5 || print3) {
				System.out.println((print5 ? "Fizz" : "") + (print3 ? "Buzz" : ""));
			} else {
				System.out.println(i);
			}
		}
	}
}