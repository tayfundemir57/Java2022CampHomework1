package arraysDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//Arrays-Diziler.
		
		String[] ogrenciler = new String[4];
		
		ogrenciler[0]="Tayfun";
		ogrenciler[1]="Mustafa";
		ogrenciler[2]="Elif Zehra";
		ogrenciler[3]="Zeynep";

		System.out.println("---------1.Yöntem---------");	
		// 1. Yöntem
		for(int i=0;i<ogrenciler.length;i++) {
		System.out.println(ogrenciler[i]);	
		
		}
		System.out.println("---------2.Yöntem---------");	
		
		//2.Yöntem
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);	
		}

	}

}
