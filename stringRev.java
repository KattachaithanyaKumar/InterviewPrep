import java.io.*;

public class stringRev {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        String rev = "";
        for (int i = 0; i < str.length(); i++)  {
            rev = str.charAt(i) + rev;
        }

        System.out.println(rev);
    }
}