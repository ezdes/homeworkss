public class Display {
    int diagonal;
    String producer;
    String matrix;

    public Display(){

    }

    public Display(int diagonal, String producer, String matrix) {
        this.diagonal = diagonal;
        this.producer = producer;
        this.matrix = matrix;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getMatrix() {
        return matrix;
    }

    public void setMatrix(String matrix) {
        this.matrix = matrix;
    }
}
