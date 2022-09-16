package stringsDemo;

public class Main {

	public static void main(String[] args) {

		String mesaj = "  Bugün hava çok güzel.  ";
		System.out.println(mesaj);

		System.out.println("Eleman sayısı : " + mesaj.length()); // String metinin kaç karakterden oluştuğunu buluruz.
		System.out.println("5.eleman: " + mesaj.charAt(4)); // charAt ile sorguladığımız index numarasındaki karakterin
															// ne olduğunu buluruz.
		System.out.println(mesaj.concat(" Yaşasın!")); // concat ile bir string metinin sonuna başka bir string metin
														// ekleriz.

		System.out.println(mesaj.startsWith("B")); // startsWith ile string değişkenin baş harfini sorgularız doğru ise
													// true yanlış ise false döner.
		System.out.println(mesaj.endsWith(".")); // endsWith ile string değişkenin son harfini sorgularız doğru ise true
													// yanlış ise false döner.

		// 18. satır karakter adlı dizi oluşturduk. 19. satırda getChars komutu ile 0dan başlayarak 5 karekteri karakter adlı değişkene ata atarken 0 dan başla
		char[] karakter = new char[5];
		mesaj.getChars(0, 5, karakter, 0); 
		System.out.println(karakter);

		System.out.println(mesaj.indexOf("av")); // mesaj değişkeni içerisindeki "av"karakterlerinin hangi index numarasından başladığını bulma. Aramaya baştan başlar.
		System.out.println(mesaj.lastIndexOf("a")); // mesaj değişkeni içerisindeki "a" karakterlerinin hangi index numarasından başladığını bulma. Aramaya sondan başlar.

		String yeniMesaj = mesaj.replace(' ', '-'); // replace ile String ifade içerisindeki boşlukları ortadan çizgi ile değiştirdik.
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2)); // substring ile mesaj değişkeni içerisindeki 2. index numarasından itibaren almayı sağladık.

		for (String kelime : mesaj.split(" ")) { // boşluğa göre kelimeleri ayırma işlemi.
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase()); // Mesaj içerisindeki metin harflerini küçük yapar.
		System.out.println(mesaj.toUpperCase()); // Mesaj içerisindeki metin harflerini büyük yapar.
		System.out.println(mesaj.trim()); // Mesaj içerisindeki metinin başında ve sonunda bulunan boşlukları siler.
	}

}
