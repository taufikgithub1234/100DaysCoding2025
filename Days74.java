import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("====Menu Berulang====");
        do {
            System.out.println("Kantin Ghosting");
            System.out.println("1. Nasi kangen");
            System.out.println("2, Martabak trauma");
            System.out.println("3. Jus nangis");
            System.out.println("4. Sudah kenyang");
            System.out.print("masukkan pilihan menu: ");
            int choise = in.nextInt();
            switch (choise) {
                case 1:
                System.out.println("anda memilih Nasi kangen");
                    break;
                case 2:
                System.out.println("anda memilih Martabak trauma");
                    break;
                case 3:
                System.out.println("anda memilih Jus nangis");
                    break;
                case 4:
                System.out.println("Alhamdulillah :)");
                    return;
            
                default:
                System.out.println("Pantas saja kau lapar,yang kau cari saja tidak ada. :(");
                System.out.println("Pilih yang ada !");
                    break;
            }

            System.out.println("");
        }while(true);
    }
}
