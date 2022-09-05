import java.io.*;

public class fib {
    public static void getfib(int a, int b, int max)  {
        int c = a + b;
        if (c >= max) return;
        System.out.print(c + " ");
        getfib(b, c, max);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.print(0 + " " + 1 + " ");
        getfib(0,1, n);
    }
}
