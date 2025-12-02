import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	int angka[] = new int[3];
	for(int data = 0; data < angka.length; data++ ){
	    System.out.print("masukkan nilai: ");
	    angka[data] = in.nextInt();
	}
	int min = angka[0];
	System.out.println("nilai terendah: ");
	for(int i = 0; i < angka.length; i++){
	 
	    if(angka[i] < min)min = angka[i];
	    }
	System.out.print("adalah "+min);
	}
}
