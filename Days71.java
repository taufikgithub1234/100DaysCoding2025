import java.util.Scanner;
public class Latihan{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Masukkan ukuran: ");
    int angka = in.nextInt();
    for(int i = 0; i < angka; i++){
      for(int j = 0; j <= i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
