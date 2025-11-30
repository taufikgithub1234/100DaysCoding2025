import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int H = input.nextInt();

        int[] jumps = new int[N];
        for(int i = 0; i < N; i++){
            jumps[i] = input.nextInt();
        }
      
        Arrays.sort(jumps);
      
        int total = 0;
        int i = N - 1;

        
      H -= jumps[i];
      total += jumps[i];
      
        for(int j = 0; j < N; j++){
            if(jumps[j] >= H){
                total += jumps[j];
                System.out.println(total);
                return;
            }
        }
    }
}
