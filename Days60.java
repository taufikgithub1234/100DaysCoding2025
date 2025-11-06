import java.util.Scanner;


public class index{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("+++ Program ganjil N-1 dan genap N-1 +++");
        System.out.print("Masukkan nilai N: "); 
        int n = in.nextInt(); 
        System.out.println("Ini N-1 untuk ganjil");
        for(int i = n; i >=1; i--){
        if(i % 2 != 0){
            System.out.println(i+" Ganjil");
            
        }
       
    }
    System.out.println();
    System.out.println("Ini N-1 untuk Genap");
    for (int i = n; i >= 1; i--) {
         if(i % 2== 0){
            System.out.println(i+" genap");

        }
    }

    }
}
