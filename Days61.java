
import java.util.Scanner;

public class kelipatanM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("+++ Program untuk melihat kelipatan M dari 1-N +++");
        System.out.print("Masukkan nilai M: ");
        int m = in.nextInt();
        System.out.print("Masukkan nilai N: ");
        int n = in.nextInt();
        System.out.print("Kelipatan "+m+" dari 1-"+n+" adalah: ");
        for(int i = 1; i <= n; i++){
            if(i%m==0)System.out.print(i+" ");
            
        }
    }
}
