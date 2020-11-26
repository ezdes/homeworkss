public class UsbPort {
    double type;
    int id;

    public UsbPort() {
    }

    public UsbPort(double type, int id) {
        this.type = type;
        this.id = id;
    }

    public double getType() {
        return type;
    }

    public void setType(double type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
