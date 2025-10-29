import java.util.Random;
import java.util.Scanner;

public class TebakAngka {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int angkaRahasia = random.nextInt(100);
        int percobaan = 0;

        System.out.println("Tebak angka antara 0-99");

        while (true) {
            System.out.print("Masukkan tebakan: ");
            int tebakan = scanner.nextInt();
            percobaan++;

            if (tebakan < angkaRahasia) {
                System.out.println("Terlalu kecil!");
            } else if (tebakan > angkaRahasia) {
                System.out.println("Terlalu besar!");
            } else {
                System.out.println("Selamat! Anda menemukan angka rahasia dalam " + percobaan + " percobaan.");
                break;
            }
        }
    }
}
