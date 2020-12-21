public abstract class AbstractLocality {
    private String name;
    private String head;
    private District[] districts;
    private int population;

    public AbstractLocality(int population, String name, String head){
        this.population = population;
        this.name = name;
        this.head = head;
    }

    public AbstractLocality(District[] districts, String name, String head, int population){
        this.districts = districts;
        this.name = name;
        this.head = head;
        this.population = population;
    }

    public abstract void findByName(String head);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
