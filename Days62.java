import java.util.Scanner;

public class Udin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("+++ Program Menjumlahkan 1-N +++");
        System.out.print("Masukkan nilai N: ");
        int n = in.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        System.out.println("Total dari 1-N adalah: "+total);
    }
}
