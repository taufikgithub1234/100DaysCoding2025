import java.util.Scanner;
public class Main {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
	    For();
	}
	public static void For(){
	    int angka[] = new int[3];
	for(int data = 0; data < angka.length; data++ ){
	    System.out.print("masukkan nilai: ");
	    angka[data] = in.nextInt();
	}
	for(int i : angka){
	    System.out.print(i+" ");
	    }
	
	    }
}
