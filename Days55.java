import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int groupA = 0;
        int groupB = 0; 

        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0) {              
                if (i % 2 == 1) {          
                    groupA++;
                } else {                   
                    groupB++;
                }
            }
        }

        System.out.println(groupA + " " + groupB);
        in.close();
    }
}
