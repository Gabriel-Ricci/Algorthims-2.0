import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("words.txt");
        int twoLetter = twoLetter();
        int longest = longest();
        int palindrome = palindrome();
        System.out.println(twoLetter);
        System.out.println(longest);
        System.out.println(palindrome);
        s.close();
    }


    public static int twoLetter() throws FileNotFoundException{
        s = new Scanner(f);
        int twoLetter = 0;
        while (s.hasNext()) {
            int l = s.nextLine().length();
            if (l == 2)
                twoLetter ++;
        }
        return twoLetter;
    }

    public static int longest() throws FileNotFoundException{
        s = new Scanner(f);
        int longest = 0;
        int current = 0;
        while (s.hasNext()) {
            int l = s.nextLine().length();
            if (l >= current) {
                if (l == current) {
                    longest++;
                } else {
                    current = l;
                    longest = 1;
                }
            }
                
        }
        return longest;
    }

    public static int palindrome() throws FileNotFoundException{
        s = new Scanner(f);
        int palindrome = 0;
        while (s.hasNext()) {
            String word = s.nextLine();
            int p = word.length();
            String c = "";
            for (int b = 0; b < p; b++) {
                c = word.substring(b, b + 1) + c;
            }
            if (word.equals(c)){
                palindrome++;
            }
        }
        return palindrome;
    }
}