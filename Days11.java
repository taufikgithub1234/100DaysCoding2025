import java.util.Scanner;
public class BelajarScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Input Int: ");
        int it = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Masukkan Input Boolean: ");
        boolean bol = sc.nextBoolean();
        sc.nextLine();
        
        System.out.print("Masukkan Input Float: ");
        float flo = sc.nextFloat();
        sc.nextLine();
        
        System.out.print("Masukkan Input Double: ");
        double dob = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Masukkan Input Long: ");
        long lon = sc.nextLong();
        sc.nextLine();
        
        System.out.print("Masukkan Input Byte: ");
        byte byt = sc.nextByte();
        sc.nextLine();
        
        System.out.print("Masukkan Input Short: ");
        short shr = sc.nextShort();
        sc.nextLine();
        
        System.out.print("Masukkan Input Char: ");
        char chr = sc.next().charAt(0);
        sc.nextLine();
        System.out.println();
        System.out.println("Ini Outputnya Integer: "+it);
        System.out.println("Ini Outputnya Boolean: "+bol);
        System.out.println("Ini Outputnya Float: "+flo);
        System.out.println("Ini Outputnya Double: "+dob);
        System.out.println("Ini Outputnya Long: "+lon);
        System.out.println("Ini Outputnya Byte: "+byt);
        System.out.println("Ini Outputnya Short: "+shr);
        System.out.println("Ini Outputnya Char: "+chr);
    }
}
