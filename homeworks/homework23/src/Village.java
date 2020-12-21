public class Village extends AbstractLocality {

    public Village(int population, String name, String head) {
        super(population, name, head);
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
