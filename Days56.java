import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = in.nextInt();

            switch (pilihan) {
                case 1 -> System.out.println("Kamu memilih Tambah");
                case 2 -> System.out.println("Kamu memilih Kurang");
                case 3 -> System.out.println("Keluar dari program...");
                default -> System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 3);
        in.close();
    }
}
