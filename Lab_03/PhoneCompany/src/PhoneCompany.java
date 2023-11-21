import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneCompany {
    List<User> users;

    private final double minutePrice;
    private final double smsPrice;
    private final double gbPrice;

        public PhoneCompany (double minutePrice, double smsPrice, double gbPrice)
        {
            this.users = new ArrayList<>();
            this.minutePrice = minutePrice;
            this.gbPrice = gbPrice;
            this.smsPrice = smsPrice;
        }

        public void readUserDataFromFile(File file) throws FileNotFoundException
        {
            Scanner input = new Scanner(file);

            while(input.hasNextLine())
            {
                int code = Integer.parseInt(input.nextLine());
                String name = input.nextLine();
                String lastname = input.nextLine();
                User user = new User(code, name, lastname);
                user.setUsedMB(Double.parseDouble(input.nextLine()));
                user.setUsedSMS(Integer.parseInt(input.nextLine()));
                user.setUsedMinutes(Integer.parseInt(input.nextLine()));
                this.users.add(user);
            }
        }

        public User findUserByCode(int code)
        {
            for(User user : this.users)
            {
                if(user.getCode() == code){
                    return user;
                }
            }
            return null;
        }

        public void computeUserCost(User user)
        {
            int usedMinutes = user.getUsedMinutes();
            double usedMB = user.getUsedMB();
            int usedSMS = user.getUsedSMS();

            user.setTotalCost(usedMinutes * minutePrice + usedSMS * smsPrice + usedMB * gbPrice / 1000);
        }
}
