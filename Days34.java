import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("== PROGRAM BANDING NILAI == ");
    System.out.println("== APAKAH C SAMA DGN A dan B KURANG DARI A == ");
    System.out.println("== DAN B TIDAK SAMA C ==");
    System.out.print("Masukkan bilangan: ");
    int a = in.nextInt();
    System.out.print("Masukkan bilangan: ");
    int b = in.nextInt();
    System.out.print("Masukkan bilangan: ");
    int c = in.nextInt();
    if((a==c && b<a) || !(b==c)){
      System.out.println("a sama dengan c: "+(a==c));
      System.out.println("b kurang dari a: "+(b<a));
      System.out.println("b tidak sama dengan c: "+(b!=c));
    }else{
      System.out.println("Syarat tidak terpenuhi");
    }
  }
}
