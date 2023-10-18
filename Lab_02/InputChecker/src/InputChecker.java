import java.util.Scanner;

public class InputChecker {

    public String checkInput(String input) {

        switch (input) {
            case "S":
                System.out.println("OK");

            case "SI":
                System.out.println("OK");

            case "OK":
                System.out.println("OK");

            case "certo":
                System.out.println("OK");

            case "perchè no?":
                System.out.println("OK");

            case "N":
                System.out.println("Fine");

            case "No":
                System.out.println("Fine");

            default:
                System.out.println("Dato non corretto");
        }
        return(input);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Dammi l'input di verifica: ");
        String input = in.nextLine();

        InputChecker inputChecker = new InputChecker();
        System.out.println(inputChecker.checkInput(input));
    }
}