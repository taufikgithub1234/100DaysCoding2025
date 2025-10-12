import java.util.Scanner;

public class CekNilai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = in.nextInt();

        if (nilai >= 75) {
            if (nilai >= 90) {
                System.out.println("Predikat: A (Sangat Baik)");
            } else {
                System.out.println("Predikat: B (Baik)");
            }
        } else {
            System.out.println("Tidak Lulus");
        }
    }
}
