import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("=== COBA AJA YAH ===");
		System.out.print("Masukkan angka: ");
		int pilihan = in.nextInt();
		switch(pilihan){
		    case 1:
		    System.out.println("Kamu Satu satunya");
		    break;
		    case 2:
		    System.out.println("Kamu tiada duanya");
		    break;
		    case 3:
		    System.out.println("Diantara aku dan kamu hanya ada kita tanpa orang 3 weakk");
		    break;
		    default:
		    System.out.println("pilihanmu tak selamanya baik");
		    break;
		    }
	}
}
