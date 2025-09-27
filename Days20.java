public class main {
    public static void main(String[] args) {
        int angka = 123;
        String teks1 = String.valueOf(angka);
        String teks2 = angka + "";

        System.out.println("Dengan valueOf: " + teks1);
        System.out.println("Dengan + \"\": " + teks2);
    }
}
