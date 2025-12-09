import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka desimal: ");
        double angka = input.nextDouble();

        System.out.println("\n=== Hasil Pembulatan ===");
        System.out.println("Input               : " + angka);
        System.out.println("Math.ceil()  (ke atas) : " + Math.ceil(angka));
        System.out.println("Math.floor() (ke bawah): " + Math.floor(angka));
        System.out.println("Math.round() (matematika): " + Math.round(angka));
    }
}
