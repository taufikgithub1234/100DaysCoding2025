import java.util.Scanner;

public class ConvertString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        System.out.print("Masukkan umur Anda (String): ");
        String umurString = in.nextLine();

    
        int umur = Integer.parseInt(umurString);

      
        System.out.print("Masukkan berat badan Anda (String): ");
        String beratString = in.nextLine();
        double berat = Double.parseDouble(beratString);

        // Output
        System.out.println("\n=== HASIL KONVERSI ===");
        System.out.println("Umur (int)   : " + umur);
        System.out.println("Berat (double): " + berat);
    }
}
