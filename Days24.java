import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("== Program membuat perhitungan luas lingkaran");
    System.out.print("\n Diketahui phi: 3.14");
    System.out.print("\n dan rumus: phi*r²");
    System.out.print("dengan syarat r adalah kelipatan 7");
    System.out.print("\n Masukkan nilai r: ");
    int r = in.nextInt();
    System.out.println("Luas lingkarang dari nilai r: "+r+" adalah: "+(3.14*r*r));
    
  }
}
