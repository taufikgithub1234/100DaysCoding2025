import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int n = in.nextInt();

        int faktorial = 1;

        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }

        System.out.println("Faktorial dari " + n + " adalah: " + faktorial);
    }
}
