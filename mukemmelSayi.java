package mukemmelSayi;

public class Main {

	public static void main(String[] args) {

		// 6 --> 1,2,3
		// 28 --> 1,2,4,7,14

		int number = 6;
		int total = 0;

		if (number < 1) {
			System.out.println("Geçersiz Sayı");
			return;
		} else {

			for (int i = 1; i < number; i++) {
				if (number % i == 0) {
					total = total + i;
				}
			}

			if (total == number) {
				System.out.println("Mükemmel Sayıdır");
			} else {
				System.out.println("Mükemmel Sayı Değildir.");
			}
		}
	}

}
