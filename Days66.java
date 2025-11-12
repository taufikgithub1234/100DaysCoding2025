import java.util.Scanner;
public class Main{
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("+++ PROGRAM POLA VERTIKAL +++ ");
        System.out.print("Masukkan nilai N: ");
        int n = in.nextInt();
  
        for (int a = 1; a<=n; a++){
                System.out.println("|");
            
        }
        System.out.println();
       System.out.print("Terima kasih");
    }
}
