import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== PROGRAM MENGHITUNG PERKALIAN DARI 1-N ===");
        System.out.print("masukan nilai N : ");
        int n = in.nextInt();
        
        int total = 1;
        
        for (int a=1;a<=n;a++){
              total *= a;
              if(a<n)System.out.print(a+", ");
              else if(a==n)System.out.print(a);
        }
        
        System.out.println("\njumlah perkalian 1-"+n+" = "+total);
    }
    
}
	
