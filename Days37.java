import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("==== Memeriksa bilangan genap+ dan ganjil| ===");
    System.out.print(" Masukkan bilangan: ");
    int bil = in.nextInt();
    if(bil%2==0){
        System.out.print(bil+" adalah bilangan Genap");
    }else{
       System.out.print(bil+" adalah bilangan ganjil");
    }
  }
}
