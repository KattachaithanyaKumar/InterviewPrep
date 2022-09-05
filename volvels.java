import java.io.*;

public class volvels {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        //dslhfdhfjdfdljflkdk

        int vowels_count = 0;
        int cons_count = 0;

        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++)  {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')  {
                vowels_count++;
            }else{
                cons_count++;
            }
        }

        System.out.println("vowels: " + vowels_count + "\nconsonants: " + cons_count);
    }
}
