public class Ram {
    int memorySize;
    String producer;

    public Ram(){

    }

    public Ram(int memorySize, String producer) {
        this.memorySize = memorySize;
        this.producer = producer;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
