package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		
		// A,E,I,İ,O,Ö,U,Ü | Kalın Sesli Harfler : A, I, O, Ü | İnce Sesli Harfler : 'E, İ, Ö, Ü
		
		char harf = 'I';
					
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Girilen " + harf + " Harfi Kalın Seslidir.");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("Girilen " + harf + " Harfi İnce Seslidir.");
			break;

		default:
			System.out.println("Girilen " + harf + " Harfi Geçersizdir.");
			break;
		}

	}

}
