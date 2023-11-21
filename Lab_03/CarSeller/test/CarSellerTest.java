import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.List;

public class CarSellerTest {


    public void ReturnByBrandAndModelTest ()
    {
        CarSeller Carseller = new CarSeller();

        File file = Path.of("/test").resolve("/testData.txt").toFile();

        try
        {
           Carseller.readDataFromFile(file);
        }catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        List<Car> CarFound = Carseller.returnFromModel("Tesla", "Model Y");
        Assert.assertEquals(2, CarFound.size());
    }

    public void ReturnByBrandModelMYTest()
    {
        CarSeller carseller = new CarSeller();

        File file = Path.of("/Test").resolve("/testData.txt").toFile();

        try
        {
            carseller.readDataFromFile(file);
        }catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }

        List<Car> CarFound = carseller.returnFromModelAndMY("Tesla", "Model Y", 2021);
        Assert.assertEquals(1, CarFound.size());
    }

    public void ReturnByBrandModelMYPrice()
    {
        CarSeller carSeller = new CarSeller();

        File file = Path.of("/test").resolve("/testData.txt").toFile();

        try
        {
            carSeller.readDataFromFile(file);
        }catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        List<Car> CarFound = carSeller.returnFromModelAndMYAndPrice("Fiat", "Punto", 2005, 1000, 2000);
        Assert.assertEquals(1, CarFound.size());
    }

}