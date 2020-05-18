package lxh.company;

public class Bicycle extends LandTransport{
    public void Bicycle(Bicycle bicycle){
        bicycle.LandTransport(bicycle);
        bicycle.drivingMethod();
    }
}
