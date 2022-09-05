import java.io.*;

public class reverse {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char[] c = str.toCharArray();

        int index = str.length() - 1;
        for (int i = 0; i < str.length() / 2; i++)  {
            char temp = c[i];
            c[i] = c[index];
            c[index] = temp;
            index--;
        }

        for (int i = 0; i < c.length; i++)  {
            System.out.print(c[i]);
        }
    }
}
