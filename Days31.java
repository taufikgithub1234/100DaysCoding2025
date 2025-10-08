import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = in.nextInt();

        System.out.println("Apakah genap positif? " + (angka % 2 == 0 && angka > 0));
    }
}
