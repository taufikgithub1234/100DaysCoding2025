import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    String hasil = (a%2==0) ? "Genap":"Ganjil";
    System.out.println(hasil);
    in.close();
  }
  
}
