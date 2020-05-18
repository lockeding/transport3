package lxh.company;

public class Person {
    private String id;
    private String name;
    private String sex;
    private String age;

    public void detailMess(){
        System.out.println("I'm "+name+' '+id+" "+ sex +' ' +age);
    }

    public void driving(AirTransport airTransport){
        airTransport.AirTransport(airTransport);
        airTransport.drivingMethod();
        airTransport.getId();
    }

    public void driving(LandTransport landTransport){
        landTransport.LandTransport(landTransport);
        landTransport.drivingMethod();
        landTransport.getId();
    }

    public void driving(MaritimeMeansOfTransport maritimeMeansOfTransport){
        maritimeMeansOfTransport.MaritimeMeansOfTransport(maritimeMeansOfTransport);
        maritimeMeansOfTransport.drivingMethod();
        maritimeMeansOfTransport.getId();
    }




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
