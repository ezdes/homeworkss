public class SolidStateDrive {
    int memorySize;
    int division;

    public SolidStateDrive(){

    }

    public SolidStateDrive(int memorySize, int division) {
        this.memorySize = memorySize;
        this.division = division;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }
}
