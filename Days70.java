import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Program persegi panjang");
		System.out.print("Masukkan panjang : ");
		int p = in.nextInt();
		System.out.print("Masukkan lebar : ");
		int l = in.nextInt();
		for(int i = 0; i < p; i++){
		   for(int j = 0; j < l; j++){
		       if(i==0 || j == 0 || i == p-1 || j == l -1){
		           System.out.print("*");
		       }else{
		          System.out.print(" ");
		       }
		       
		   }
		   System.out.println("");
	    }
	}
}
