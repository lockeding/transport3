package lxh.company;

public class Aircraft extends AirTransport{
    public void Aircraft(Aircraft aircraft){
        aircraft.AirTransport(aircraft);
        aircraft.drivingMethod();
    }
}
