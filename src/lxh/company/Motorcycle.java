package lxh.company;

public class Motorcycle extends LandTransport{
    public void Motorcycle(Motorcycle motorcycle){
        motorcycle.LandTransport(motorcycle);
        motorcycle.drivingMethod();
    }
}
