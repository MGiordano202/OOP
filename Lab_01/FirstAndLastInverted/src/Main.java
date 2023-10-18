public class Main {
    public static void main(String[] args) {
        String[] words = {"c", "ac", "pippo"};

        for (String word : words) {
            String result;

            if(word.length() < 2)
            {
                result = ("Stringa corta");
            }
            else
            {
                String First = word.substring(0, 1);
                String Last = word.substring(word.length() - 1);
                String Middle = "";
                if(word.length() > 2)
                {
                    Middle = word.substring(1, word.length() -1);
                }

                result = Last.concat(Middle).concat(First);


            }

            System.out.println(result);
        }
    }
}