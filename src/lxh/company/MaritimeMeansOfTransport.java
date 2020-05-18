package lxh.company;

import java.util.Date;

public class MaritimeMeansOfTransport implements HandlerTransport{
    private String ownership = null;
    private String GPSposition = null;
    private String price = null;
    private Date dataOfpurchase = null;
    private String id = null;

    public void MaritimeMeansOfTransport(){}

    public void MaritimeMeansOfTransport(MaritimeMeansOfTransport maritimeMeansOfTransport){
        System.out.println("It's MaritimeMeansOfTransport.");
    }

    @Override
    public void drivingMethod() {
        System.out.println("It's "+id);
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getGPSposition() {
        return GPSposition;
    }

    public void setGPSposition(String GPSposition) {
        this.GPSposition = GPSposition;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getDataOfpurchase() {
        return dataOfpurchase;
    }

    public void setDataOfpurchase(Date dataOfpurchase) {
        this.dataOfpurchase = dataOfpurchase;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
