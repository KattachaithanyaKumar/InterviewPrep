import java.io.*;

public class occur {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char c = br.readLine().charAt(0);
        
        int count = 0;

        for (int i = 0; i < str.length(); i++)  {
            if (str.charAt(i) == c)  {
                count++;
            }
        }

        System.out.println(count);

    }
}
