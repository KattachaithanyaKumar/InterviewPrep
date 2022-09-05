import java.io.*;
public class palli {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String rev = "";

        for (int i = 0; i < str.length(); i++)  {
            rev = str.charAt(i) + rev;
        }

        if (str.equals(rev))  {
            System.out.println("these are in pallindrome");
        }else{
            System.out.println("These are not in pallindrome");
        }
    }
}
