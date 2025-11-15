import java.util.Scanner
public class Main{
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int awal = 0;
    int a = in.nextInt();
    awal = a;
    int jumlah = 1;
    for(int i = 0; i < n - 1; i++){
    int angka = in.nextInt();
      if(awal + 1 != angka) {
      jumlah++;
      }
      awal = angka;
    }
    System.out.println(jumlah);
  }
}
