import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	int angka[] = new int[3];
	for(int data = 0; data < angka.length; data++ ){
	    System.out.print("masukkan nilai: ");
	    angka[data] = in.nextInt();
	}
	boolean status = false;
	System.out.print("inout nilai yang ingin dicari: ");
	int find = in.nextInt();

	System.out.println("Apakah ada pada elemen array");
	for(int i = 0; i < angka.length; i++){
	 if(find==angka[i]){
	     System.out.println("Ada dan berada di index: "+i);         status = true;
	     break;
	     }
	}
	if(status!=true){
	    System.out.println("elemen yang dicari tidak ada.");
	    }
	}
}
