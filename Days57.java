public class NestedLoop2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {        // tinggi segitiga
            for (int j = 1; j <= i; j++) {    // jumlah bintang tiap baris
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
