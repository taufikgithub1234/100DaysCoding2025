public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println(kalku(a, b, '+'));
        System.out.println(kalku(a, b, '-'));
        System.out.println(kalku(a, b, '*'));
        System.out.println(kalku(a, b, '/'));
        
    }

    static int kalku(int a, int b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            default: return 0;
        }
    }
}
