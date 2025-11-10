import java.util.Scanner;

public class Latihan {    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=====Program mencari nilai M pangkat N======");
        System.out.print("Masukkan M: ");
        int m = in.nextInt();
        System.out.print("Masukkan N: ");
        int n = in.nextInt();
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= m;
          
        }
        System.out.println("Hasil: "+hasil);
    }
}
