public class KonversiManual {
    public static void main(String[] args) {
        double a = 99.99;
        float b = (float) a;  
        long c = (long) b;   
        int d = (int) c;       
        short e = (short) d;  
        byte f = (byte) e;   

        System.out.println("Nilai double : " + a);
        System.out.println("Nilai float  : " + b);
        System.out.println("Nilai long   : " + c);
        System.out.println("Nilai int    : " + d);
        System.out.println("Nilai short  : " + e);
        System.out.println("Nilai byte   : " + f);
    }
}
