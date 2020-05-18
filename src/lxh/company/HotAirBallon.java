package lxh.company;

public class HotAirBallon extends AirTransport{
    public void HotAirBallon(HotAirBallon hotAirBallon){
        hotAirBallon.AirTransport(hotAirBallon);
        hotAirBallon.drivingMethod();
    }
}
