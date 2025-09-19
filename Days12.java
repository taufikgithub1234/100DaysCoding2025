import java.util.Scanner;

public class BioData {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nama anda: ");
        String nama = in.nextLine();

        System.out.print("Umur Anda: ");
        byte umur = in.nextByte();
        in.nextLine(); 

        System.out.print("Alamat Anda: ");
        String alamat = in.nextLine();

        System.out.print("Berat Anda: ");
        double berat = in.nextDouble();
        in.nextLine();
      
        System.out.print("Golongan darah Anda: ");
        char darah = in.next().charAt(0);
        in.nextLine();

        System.out.print("Hobi Anda: ");
        String hobi = in.nextLine();

        System.out.print("Tinggi Anda: ");
        double tinggi = in.nextDouble();

        System.out.println("\n--- BIODATA ANDA ---");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Alamat: " + alamat);
        System.out.println("Berat: " + berat);
        System.out.println("Golongan darah: " + darah);
        System.out.println("Hobi: " + hobi);
        System.out.println("Tinggi: " + tinggi);
    }
}
