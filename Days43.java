import java.util.Scanner;

public class KeliPatan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== PROGRAM MENGECEK KELIPATAN 3,5,DAN 3 DAN 5 ===");
        System.out.print("Masukkan angka: ");
        int a = in.nextInt();
        if(a%3==0 && a%5==0){
            System.out.println(a+" adalah angka kelipatan 3 dan 5.");
        }else if(a%3==0){
            System.out.println(a+" adalah kelipatan 3.");
        }else if(a%5==0){
            System.out.println(a+" adalah keipatan 5.");
        }else{
            System.out.println((a%33==0 && a%5==0)+" bukan kelipatan 3 atau 5");
        }
        
    }
}
