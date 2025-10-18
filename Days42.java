import java.util.Scanner;

public class soal8 {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.print("Masukkan Gaji Pokok: ");
         double a = in.nextDouble();
         
         double gajiKotor,tunjangan,pajak,bonus,bpjs,gajiBersih;
         bpjs = a * 0.05;
         tunjangan = a*0.20;//20%
         gajiKotor = a+tunjangan;
         pajak = 0.10 * gajiKotor;
         bonus = 0;
         if(a>= 5000000){
             bonus = 500000;
         }else{
             if(a<5000000){
                 bonus = 300000;
             }
         }
         gajiBersih = (a + tunjangan + bonus) - (pajak + bpjs);
         
         System.out.println("--- RINCIAN GAJI ---");
         System.out.println("GAJI POKOK Rp:"+a);
         System.out.println("TUNJANGAN: Rp"+tunjangan);
         System.out.println("Bonus: Rp"+bonus);
         System.out.println("Pajak: Rp"+pajak);
         System.out.println("Potongan BPJS: Rp"+bpjs);
         System.out.println("------------------------");
         System.out.println("Gaji Bersih: Rp"+gajiBersih);
    }
}
