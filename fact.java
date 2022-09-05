import java.io.*;

public class fact {
    public static int factorial(int n)  {
        if (n == 1) return 1;
        else 
        return (n * factorial(n-1)); 
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int res = 1;
        for (int i = 1; i <= n; i++)  {  
            res *= i;
        }

        System.out.println(res);
        System.out.println(factorial(n));
    }
}
