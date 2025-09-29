import java.util.Scanner;
public class main{
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
    System.out.print("== Menghitung Luas Persegi ==");
    System.out.print("\nMasukkan nilai sisi: ");
    byte sisi = in.nextByte();
    System.out.println(" Luas Persegi adalah nilai sisinya "+sisi+" adalah "+sisi*2);
    
  }
}
