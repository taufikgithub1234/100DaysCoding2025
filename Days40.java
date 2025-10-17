import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== KALKULATOR SEDERHANA (int) ===");
        System.out.println("1. Tambah (+)");
        System.out.println("2. Kurang (-)");
        System.out.println("3. Kali (*)");
        System.out.println("4. Bagi (/)");
        System.out.print("Pilih operator (1-4): ");
        int pilihan = in.nextInt();

        System.out.print("Masukkan angka pertama: ");
        int a = in.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = in.nextInt();

        int hasil = 0;

        if (pilihan == 1) {
            hasil = a + b;
            System.out.println("Hasil penjumlahan: " + hasil);
        } else if (pilihan == 2) {
            hasil = a - b;
            System.out.println("Hasil pengurangan: " + hasil);
        } else if (pilihan == 3) {
            hasil = a * b;
            System.out.println("Hasil perkalian: " + hasil);
        } else if (pilihan == 4) {
            if (b != 0) {
                hasil = a / b; // pembagian integer
                System.out.println("Hasil pembagian: " + hasil);
            } else {
                System.out.println("Error: Tidak bisa dibagi dengan nol!");
            }
        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }
}
