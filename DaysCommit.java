import java.util.Scanner;
public class baru {
    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);
        final double PI = 3.14159;
        System.out.println("NIlai Phi adalah: "+PI);
        
        
        System.out.print("Masukkan nilai r: ");
        int r = on.nextInt();
        System.out.println("Luas Lingkaran adalah: "+(PI*r*r));
    }
}
