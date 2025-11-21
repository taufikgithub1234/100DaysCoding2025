package latihan_Soal;

import java.util.Scanner;

public class soalmethodString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
System.out.println("===Program method dasar String ===");
        System.out.print("Input: ");
        String nama = in.nextLine();


        System.out.println("Jumlah kata/karakter: "+nama.length());
        System.out.println("toLowerCase: "+nama.toLowerCase());
        System.out.println("toUpperCase: "+nama.toUpperCase());
    }
    
}
