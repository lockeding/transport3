package lxh.company;

public class Airship extends AirTransport{
    public void Airship(Airship airship){
        airship.AirTransport(airship);
        airship.drivingMethod();
    }
}
