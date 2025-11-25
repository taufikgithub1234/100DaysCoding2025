import java.util.Scanner;
public class soal1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String user1,pass1;
        boolean status = false;
        String user,pass;
        System.out.println("===Halaman Buat Akun===");
            System.out.print("Masukkan Username: ");
            user1 = in.nextLine();
            System.out.print("Masukkan Password: ");
            pass1 = in.nextLine();
        while (true) {
            System.out.println("===Halaman Login===");
            System.out.print("Masukkan Username: ");
            user = in.nextLine();
            System.out.print("Masukkan Password: ");
            pass = in.nextLine();
            if(user.equalsIgnoreCase(user1) && pass.equalsIgnoreCase(pass1)){
                System.out.println("Login berhasil");
                status = true;
                break;
            }else{
                System.out.println("Username atau Password salah, Ulangi!");
            }
            System.out.println();
        }
        
    }
}
