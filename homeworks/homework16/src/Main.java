public class Main {

    public static void main(String[] args) {

        Sheep sheepOneFarm1 = new Sheep(70, 3, "Female", "Ludociel");
        Sheep sheepTwoFarm1 = new Sheep(90, 4, "Male", "Zeldris");
        Sheep sheepThreeFarm1 = new Sheep(80, 5, "Male", "Estarossa");

        Cow cowOneFarm1 = new Cow(360, 9, "Female", "Saitama");
        Cow cowTwoFarm1 = new Cow(570, 5, "Male",  "Genos");
        Cow cowThreeFarm1 = new Cow(680, 12, "Male", "Azazel");
        Cow cowFourFarm1 = new Cow(280, 2, "Female", "Elizabet");
        Cow cowFiveFarm1 = new Cow(999, 10, "Male", "Meliodas");

        Horse horseOneFarm1 = new Horse(400, 6, "Black", "Male", "Escanor");
        Horse horseTwoFarm1 = new Horse(600, 10, "White", "Male", "Mael");
        Horse horseThreeFarm1 = new Horse(300, 4, "Pink", "Female", "Melascula");

        Sheep[] sheepFarm1 = {sheepOneFarm1, sheepTwoFarm1, sheepThreeFarm1};
        Cow[] cowsFarm1 = {cowOneFarm1, cowTwoFarm1, cowThreeFarm1, cowFourFarm1, cowFiveFarm1};
        Horse[] horsesFarm1 = {horseOneFarm1, horseTwoFarm1, horseThreeFarm1};

        Farm farm1 = new Farm("Nigeria", cowsFarm1, sheepFarm1, horsesFarm1, "Kaguya Otsutsuki");
        farm1.printFarm();

        Sheep sheepOneFarm2 = new Sheep(100, 3, "Male", "Montspeet");
        Cow cowOneFarm2 = new Cow(1000, 5, "Male", "Gloxinia");
        Horse horseOneFarm2 = new Horse(1100, 9, "Green", "Male", "Khabib");

        Sheep[] sheepFarm2 = {sheepOneFarm2};
        Cow[] cowsFarm2 = {cowOneFarm2};
        Horse[] horsesFarm2 = {horseOneFarm2};

        Farm farm2 = new Farm("Argentina", cowsFarm2, sheepFarm2, horsesFarm2, "Obito Uchiha");
        farm2.printFarm();

    }
}
