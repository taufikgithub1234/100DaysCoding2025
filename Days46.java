import java.util.Scanner;

public class MenuSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("===== MENU UTAMA =====");
            System.out.println("1. Hitung Luas Persegi");
            System.out.println("2. Hitung Luas Lingkaran");
            System.out.println("3. Hitung Luas Segitiga");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan sisi: ");
                    double sisi = input.nextDouble();
                    System.out.println("Luas persegi = " + (sisi * sisi));
                    break;
                case 2:
                    System.out.print("Masukkan jari-jari: ");
                    double r = input.nextDouble();
                    System.out.println("Luas lingkaran = " + (3.14 * r * r));
                    break;
                case 3:
                    System.out.print("Masukkan alas: ");
                    double alas = input.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggi = input.nextDouble();
                    System.out.println("Luas segitiga = " + (0.5 * alas * tinggi));
                    break;
                case 4:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
            System.out.println();
        } while (pilihan != 4);
    }
}
