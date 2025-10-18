import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int jamselesai = (a+b) %24;
    int sisaWaktu;
    if(jamselesai <=9) {
      sisaWaktu= 9 - jamselesai;
    }else{
      sisaWaktu = (24 - jamselesai) + 9;
    }
    System.out.println(sisaWaktu + " jam");
  }
}
