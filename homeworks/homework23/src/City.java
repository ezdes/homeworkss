public class City extends AbstractLocality{
    public City(District[] districts, String name, String head, int population) {
        super(districts, name, head, population);
    }

    @Override
    public void findByName(String head) {
        if (getHead().equals(head)){
            System.out.println(head);
        }

        else {
            System.out.println("Not Found");
        }
    }
}
