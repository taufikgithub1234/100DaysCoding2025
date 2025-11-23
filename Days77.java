import java.util.Scanner;

public class soalStringMethod1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String valid;
        Line();System.out.println("= METHOD STRING MANIPULASI SUBSTRING,REPLACE, DAN TRIM =");Line();
        Line();
        System.out.println("1. Substring-(idx 0 - 5)");
        System.out.print("Input kalimat :) : ");
        String text = in.nextLine();
        if(text.length() >= 5){
            System.out.println("Substring: "+text.substring(0,5));
        }else{  
            System.out.println("Input terlalu pendek untuk substring 0-5");
        }
            
        
        System.out.print("Lanjut yuk ke Replace()-Enter");
        valid = in.nextLine();
        Line();

        Line();
        System.out.println("2. Replace-(a to o)");
        System.out.print("Input kalimat :) : ");
        String text1 = in.nextLine();
        System.out.println("Replace karakter 'a' menjadi 'o' : "+text1.replace('a', 'o'));
        System.out.print("Lanjut yuk ke Trim()Enter");
        valid = in.nextLine();
        Line();

        Line();
        System.out.println("3. Trim");
        System.out.print("Input kalimat :) : ");
        String text3 = in.nextLine();
        System.out.println("Trim spasi awal dan akhir dihilangkan  : "+text3.trim());
        System.out.println("Selesai :)");
        System.out.println("Catatan untuk Trim: 'dia menghapus spasi awal dan akhir bukan di tengah.'");
        Line();
    }
    static void Line(){
        System.out.println("====================================");
    }
}
