import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	int angka[] = new int[3];
	for(int data = 0; data < angka.length; data++ ){
	    System.out.print("masukkan nilai: ");
	    angka[data] = in.nextInt();
	}
	int max = angka[0];
	System.out.println("nilai tertinggi: ");
	for(int i = 0; i < angka.length; i++){
	    if(angka[i] > max)max = angka[i];
	    }
	System.out.print("adalah "+max);
	}
}
