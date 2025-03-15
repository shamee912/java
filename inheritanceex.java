class vehicle
{
    String color;
    int year;
}

class car extends vehicle
{
    String brand;
}
public class inheritanceex
{
    public static void main(String[] args)
    {
        car mycar=new car();
        mycar.color="Yellow";
        mycar.year=2000;
        mycar.brand="BMW";
        System.out.println("Color:"+mycar.color);
        System.out.println("year:"+mycar.year);
        System.out.println("Brand:"+mycar.brand);
    }
}
