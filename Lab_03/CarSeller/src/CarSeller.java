import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarSeller {
    private final List<Car> cars;

    public CarSeller() {
        this.cars = new ArrayList<>();
    }

        public void readDataFromFile(File file) throws FileNotFoundException
        {

            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine())
            {

                String Brand = scanner.nextLine();
                String Model = scanner.nextLine();

                int ManufacturingYear = Integer.parseInt(scanner.nextLine());
                double price = Double.parseDouble(scanner.nextLine());

                Car car = new Car(Brand, Model, ManufacturingYear, price);
                this.cars.add(car);

            }

        }

        public List<Car> returnFromModelAndMY (String Brand, String Model, int ManufacturingYear)
        {
            List<Car> CarFound = new ArrayList<>();
            for(Car car : this.cars)
            {

                if(car.getBrand().equals(Brand) && car.getModel().equals(Model) && car.getManufacturingYear() >= ManufacturingYear)
                {
                    CarFound.add(car);
                }
            }
            return CarFound;
        }

    public List<Car> returnFromModel (String Brand, String Model)
    {
        List<Car> CarFound = new ArrayList<>();
        for(Car car : this.cars)
        {

            if(car.getBrand().equals(Brand) && car.getModel().equals(Model))
            {
                CarFound.add(car);
            }
        }
        return CarFound;
    }

    public List<Car> returnFromModelAndMYAndPrice (String Brand, String Model, int ManufacturingYear, int minPrice, int maxPrice)
    {
        List<Car> CarFound = new ArrayList<>();
        for(Car car : this.cars)
        {

            if(car.getBrand().equals(Brand)
                    && car.getModel().equals(Model)
                    && car.getManufacturingYear() >= ManufacturingYear
                    && car.getPrice() >= minPrice
                    && car.getPrice() <= maxPrice)
            {
                CarFound.add(car);
            }
        }
        return CarFound;
    }



}