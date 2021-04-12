import java.util.Scanner;

public class NotOrtalamasiHesabi {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int sinav1, sinav2, sinav3;
		int sozlu1, sozlu2, sozlu3;
		
		double ortalama;
		
		System.out.print("1. Sinavi giriniz ==>");
		sinav1 = input.nextInt();
		System.out.print("2. Sinavi giriniz ==>");
		sinav2 = input.nextInt();
		System.out.print("3. Sinavi giriniz ==>");
		sinav3 = input.nextInt();
		
		System.out.print("1. Sozluyu giriniz ==>");
		sozlu1 = input.nextInt();
		System.out.print("2. Sozluyu giriniz ==>");
		sozlu2 = input.nextInt();
		System.out.print("3. Sozluyu giriniz ==>");
		sozlu3 = input.nextInt();
		
		ortalama = (sinav1 + sinav2 + sinav3 + sozlu1 + sozlu2 + sozlu3) /6 ;
		
		String sonuc = (ortalama >= 50) ? "gectiniz" : "kaldiniz";
		
		System.out.print(ortalama + " ortalama ile " + sonuc);
		
		input.close();
	}
}
