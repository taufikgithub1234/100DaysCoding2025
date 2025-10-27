import java.util.Scanner;
public class For {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan batas: ");
        int a = in.nextInt();
        System.out.print("Masukkan nilai awal: ");
        int b = in.nextInt();
        in.nextLine();
        
        System.out.print("Masukkan kata/kalimat yang ingin diulang: ");
        String kata = in.nextLine();
        
        for(int c = b; c <a; c++){
            String tampung = kata;
            System.out.println(c+". "+tampung);
            
        }
        in.close();
    }
}
