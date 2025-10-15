import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("=== Memeriksa bilangan +,-, dan 0 ===");
	System.out.print("Masukkan sebuah angka: ");
	int angka = in.nextInt();
	if(angka>0){
	    System.out.println(angka+" ini adalah bilangan positif");
	}else if(angka<0){
	    System.out.println(angka+" ini adalah bilangan negatif");
	}else{
	    System.out.println(angka+ " ini adalah nol");
	}
	}
}
