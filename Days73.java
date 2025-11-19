import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== Program penjumlahan dan berhenti ketika menginput negatif ===");
        int total = 0;
        for (int i = 0; i > -1; i++) {
            System.out.print("Input angka: ");
            int angka = in.nextInt();
            if(angka >= 0){
                total += angka;
            }
            if (angka < 0) {
                break;
            }
        }
        System.out.println("Hasil: " + total);
    }
}
