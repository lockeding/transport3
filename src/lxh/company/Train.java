package lxh.company;

public class Train extends LandTransport{
    public void Train(Train train){
        train.LandTransport(train);
        train.drivingMethod();
    }
}
