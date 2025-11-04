import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int N = in.nextInt();

        // Cetak 1 sampai N
        System.out.println("Angka 1 ke N:");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }

        System.out.println(); // ganti baris

        // Cetak N sampai 1
        System.out.println("Angka N ke 1:");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }

        in.close();
    }
}
