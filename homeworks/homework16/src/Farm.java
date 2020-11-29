public class Farm {
    String address;
    Cow[] cows;
    Sheep[] sheep;
    Horse[] horses;
    String fullNameOfTheOwner;

    public Farm() {
    }

    public Farm(String address, Cow[] cows, Sheep[] sheep, Horse[] horses, String fullNameOfTheOwner) {
        this.address = address;
        this.cows = cows;
        this.sheep = sheep;
        this.horses = horses;
        this.fullNameOfTheOwner = fullNameOfTheOwner;
    }

    public void printFarm(){

        System.out.println("Address: " + address);

        System.out.println("-----------------------------");
        System.out.println("Cows: ");
        for (Cow c : cows){
            if (c != null)
                c.printCow();
        }

        System.out.println("-----------------------------");
        System.out.println("Sheep: ");
        for (Sheep s : sheep){
            if (s != null)
                s.printSheep();

        }

        System.out.println("-----------------------------");
        System.out.println("Horses: ");
        for (Horse h : horses){
            if (h != null)
                h.printHorse();
        }

        System.out.println("-----------------------------");
        System.out.println("Owner: " + fullNameOfTheOwner);
        System.out.println("\n");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public String getFullNameOfTheOwner() {
        return fullNameOfTheOwner;
    }

    public void setFullNameOfTheOwner(String fullNameOfTheOwner) {
        this.fullNameOfTheOwner = fullNameOfTheOwner;
    }
}
