import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan huruf: ");
        char huruf = in.next().charAt(0);

        if (huruf == 'a' || huruf == 'i' || huruf == 'u' || huruf == 'e' || huruf == 'o') {
            System.out.println("Huruf vokal");
        } else {
            System.out.println("Huruf konsonan");
        }
    }
}
