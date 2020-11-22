public class Main {

    public static void main(String[] args) {

        Anime deathNote = new Anime();
        deathNote.name = "Death Note";
        deathNote.year = 2006;
        deathNote.genre = "Detective";
        deathNote.subGenre = "Horror";
        deathNote.price = 5.90;

        Anime fireForce = new Anime();
        fireForce.name = "Fire Force";
        fireForce.year = 2019;
        fireForce.genre = "Action";
        fireForce.subGenre = "Comedy";
        fireForce.price = 6.90;


        System.out.println(deathNote.name + " " + deathNote.year + " " + deathNote.genre + " " + deathNote.subGenre + " " + deathNote.price);
        System.out.println(fireForce.name + " " + fireForce.year + " " + fireForce.genre + " " + fireForce.subGenre + " " + fireForce.price);
    }
}
