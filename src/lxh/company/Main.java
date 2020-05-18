package lxh.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setId("20190000");
        person.setSex("man");
        person.setName("张三");
        person.setAge("20");

        person.detailMess();

        Aircraft aircraft = new Aircraft();
        aircraft.setId("aircraft1");
        person.driving(aircraft);
        System.out.println("---------------------------------------------");

        Airship airship = new Airship();
        airship.setId("airship1");
        person.driving(airship);
        System.out.println("---------------------------------------------");

        Automobile automobile = new Automobile();
        automobile.setId("automobile1");
        person.driving(automobile);
        System.out.println("---------------------------------------------");

        Bicycle bicycle = new Bicycle();
        bicycle.setId("bicycle1");
        person.driving(bicycle);
        System.out.println("---------------------------------------------");

        HotAirBallon hotAirBallon = new HotAirBallon();
        hotAirBallon.setId("hotAirballon1");
        person.driving(hotAirBallon);
        System.out.println("---------------------------------------------");

        Hovercraft hovercraft = new Hovercraft();
        hovercraft.setId("hovercraft1");
        person.driving(hovercraft);
        System.out.println("---------------------------------------------");

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.setId("motorcycle1");
        person.driving(motorcycle);
        System.out.println("---------------------------------------------");

        Submarine submarine = new Submarine();
        submarine.setId("submarine1");
        person.driving(submarine);
        System.out.println("---------------------------------------------");

        Train train = new Train();
        train.setId("train1");
        person.driving(train);
        System.out.println("---------------------------------------------");


        Ship ship = new Ship();
        ship.setId("ship1");
        person.driving(ship);



    }
}
