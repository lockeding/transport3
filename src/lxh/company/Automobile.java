package lxh.company;

public class Automobile extends LandTransport{
    public void Automobile(Automobile automobile){
        automobile.LandTransport(automobile);
        automobile.drivingMethod();
    }
}
