import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("=== PROGRAM UNTUK MENGECEK PREDIKAT A-E ===");
		System.out.print("Input Nilai: ");
		int nilai = in.nextInt();
		
		if(nilai>=85 && nilai <=100){
		    System.out.println("Predikat A");
		}else if(nilai >=75 && nilai <= 84){
		    System.out.println("Predikat B");
		}else if(nilai >=65 && nilai <= 74){
		    System.out.println("Predikat C");
		}else if(nilai >=50 && nilai <= 64){
		    System.out.println("Predikat D");
		}else if(nilai >0 && nilai <50){
		    System.out.println("Predikat E");
		}
	
		if(nilai < 0  || nilai > 100){
		    System.out.println("Nilai tidak valid!");
		    }
		
	}
}
