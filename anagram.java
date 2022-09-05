import java.io.*;
import java.util.Arrays;

public class anagram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if (Arrays.equals(c1, c2))  {
            System.out.println("These are anagrams");
        }else{
            System.out.println("These are not anagrams");
        }
    }
}
