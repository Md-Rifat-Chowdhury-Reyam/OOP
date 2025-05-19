package Interface.MethodReferance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InstancemMethodReferance {
    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Marchidies", 2));
        carList.add(new Car("Toyota", 3));
        carList.add(new Car("Tata",4));

        Helper hlp = new Helper();

        // Now using instance method reference
        // to sort array by name
        Collections.sort(carList, hlp :: compareByName);

        System.out.println("sort by Company Name :");
        carList.stream().map(x -> x.getCarName()).forEach(System.out :: println);



    }
}

class Car
{
    private String carName;
    private Integer carPrice;

    Car(String companyName, int carPrice)
    {
        this.carName = companyName;
        this.carPrice = carPrice;
    }

    public String getCarName() {
        return carName;
    }

    public Integer getCarPrice() {
        return carPrice;
    }
}

class Helper
{
    public int compareByName(Car a, Car b)
    {
        return a.getCarName().compareTo(b.getCarName());
    }

    public int compareByPrice(Car a, Car b)
    {
        return a.getCarPrice().compareTo(b.getCarPrice());
    }
}