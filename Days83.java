import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	int angka[] = new int[3];
	for(int data = 0; data < angka.length; data++ ){
	    System.out.print("masukkan nilai: ");
	    angka[data] = in.nextInt();
	}
	int jumlah = 0;
	System.out.println("dijumlahkan Array: ");
	for(int i = 0; i < angka.length; i++){
	    jumlah += angka[i];
	    }
	System.out.print("Total: "+jumlah);
	}
}
