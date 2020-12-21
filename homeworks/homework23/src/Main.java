public class Main {

    public static void main(String[] args) {

        District district1 = new District(10000, "District1", "Head1");
        District district2 = new District(5000, "District2", "Head2");
        District district3 = new District(1000, "District3", "Head3");
        District district4 = new District(15000, "District4", "Head4");
        District district5 = new District(500, "District5", "Head5");

        District[] districtsOfCity1 = {district1, district2};
        District[] districtsOfCity2 = {district3};
        District[] districtsOfCity3 = {district4, district5};

        City city1 = new City(districtsOfCity1, "City1", "Peter", 15000);
        City city2 = new City(districtsOfCity2, "City2", "Ray", 1000);
        City city3 = new City(districtsOfCity3, "City3", "Toni", 15500);

        Village village1 = new Village(300, "Village1", "Justin");
        Village village2 = new Village(400, "Village2", "Jon");

        city1.findByName("Peter");
        district1.findByName("Toni");
        village1.findByName("Justin");

    }
}
