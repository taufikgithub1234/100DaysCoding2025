import java.util.Scanner;

public class soalStringmethod{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("===PROGRAM METHOD STRING===");
        String valid;
        // Equals
        System.out.println("===1. Equals===");
        System.out.print("1. masukkan input : ");
        String equals = in.nextLine();
        System.out.print("2. masukkan input : ");
        String equals1 = in.nextLine();
        System.out.print("Apakah sama persis ? "+equals.equals(equals1));
        line();

        // EqualsIgnoreCase
        System.out.print("\nlanjut yuk,klik(enter)");
        valid = in.nextLine();
        System.out.println("===2. EqualsIgnoreCase===");
        System.out.print("1. masukkan input : ");
        String ignore = in.nextLine();
        System.out.print("2. masukkan input : ");
        String ignore1 = in.nextLine();
        System.out.print("Apakah sama ? "+ignore.equalsIgnoreCase(ignore1));
        line();

        // contains
         System.out.print("\nlanjut yuk,klik(enter)");
        valid = in.nextLine();
        System.out.println("===3. Contains - cek kata java===");
        System.out.print("1. masukkan input : ");
        String contains = in.nextLine();
        System.out.print("Apakah ada kata java ? "+contains.contains("java"));
        line();

        // isEmpty
        System.out.print("\nlanjut yuk,klik(enter)");
        valid = in.nextLine();
        System.out.println("===4. isEmpty - cek string kosong===");
        System.out.print("1. masukkan input : ");
        String empty = in.nextLine();
        System.out.print("Apakah input kosong ? "+empty.isEmpty());
        line();
        in.close();
    }
    public static void line(){
        System.out.println("\n======================================");
    }
}
