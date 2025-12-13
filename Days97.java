import java.util.Scanner;

public class LuasPersegi {

    // method non-void dengan parameter
    static int hitungLuas(int sisi) {
        int luas = sisi * sisi;
        return luas;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi persegi: ");
        int sisi = in.nextInt();

        int hasil = hitungLuas(sisi);

        System.out.println("Luas persegi adalah: " + hasil);
    }
}
