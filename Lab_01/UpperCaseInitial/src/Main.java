import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String[] words = {"", "a", "alice", "bob", "pippo", "pluto"};

        for (String word : words) {
            if(!word.isEmpty())
            {
                String initial = String.valueOf(word.charAt(0));// copiato, ma non capito, cosa fai?
                String uppinitial = initial.toUpperCase();
                String remaining = word.substring(1);
                String upperWord = uppinitial + remaining;
                System.out.println(upperWord);
            }
            else
            {
                System.out.println();
            }
        }
    }
}