package lxh.company;

public class Ship extends MaritimeMeansOfTransport{
    public void Ship(Ship ship){
        ship.MaritimeMeansOfTransport(ship);
        ship.drivingMethod();
    }
}
