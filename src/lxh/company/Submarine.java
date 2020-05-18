package lxh.company;

public class Submarine extends MaritimeMeansOfTransport{
    public void Submarine(Submarine submarine){
        submarine.MaritimeMeansOfTransport(submarine);
        submarine.drivingMethod();
    }
}
