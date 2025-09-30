import java.util.Scanner;
public class Main{
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("== Program Menghitung Luas Persegi Panjang ==");
  System.out.print("\nMasukkan nilai panjang: ");
  short p = in.nextShort();

  System.out.print("\nMasukkan nilai Lebar: ");
  short l = in.nextShort();

  System.out.println("jadi luas dari persegi panjang dengan nilai tersebut adalah: "+(p*l));
}
}
